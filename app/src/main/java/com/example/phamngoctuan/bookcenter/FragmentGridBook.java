package com.example.phamngoctuan.bookcenter;

import android.annotation.TargetApi;
import android.support.v4.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by phamngoctuan on 23/05/2016.
 */
public class FragmentGridBook extends Fragment{
    private int typeData;

    FragmentGridBook(int t)
    {
        typeData = t;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_grid_book, container, false);

        final SwipeRefreshLayout refresh = (SwipeRefreshLayout)rootView.findViewById(R.id.swiperefresh);
        refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(getContext(), "Refresh " + typeData, Toast.LENGTH_SHORT).show();
                refresh.setRefreshing(false);
            }
        });

        GridView grid = (GridView)rootView.findViewById(R.id.gridView);
        GridViewAdapter adapter;

        MyConstant constant = MyConstant.getInstance();
        if (typeData == constant.ONLINE_DATA)
            adapter = new GridViewAdapter(getActivity().getApplicationContext(), R.layout.grid_item_layout, constant._onlineData);
        else
            adapter = new GridViewAdapter(getActivity().getApplicationContext(), R.layout.grid_item_layout, constant._offlineData);

        if (grid != null)
            grid.setAdapter(adapter);
        return rootView;
    }
}
