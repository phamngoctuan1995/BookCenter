package com.example.phamngoctuan.bookcenter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by phamngoctuan on 23/05/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        MyConstant constant = MyConstant.getInstance();
        switch (position) {
            case 0:
                return new FragmentGridBook(constant.ONLINE_DATA);
            case 1:
                return new FragmentGridBook(constant.OFFLINE_DATA);
            case 2:
                return new FragmentGridBook(constant.FAVORITE_DATA);
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        MyConstant constant = MyConstant.getInstance();

        switch (position)
        {
            case 0:
                return "Sách Online";
            case 1:
                return "Sách Offline";
            case 2:
                return "Sách yêu thích";
            default:
                return "Tab";
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
