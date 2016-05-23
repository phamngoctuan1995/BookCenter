package com.example.phamngoctuan.bookcenter;

import java.util.ArrayList;

/**
 * Created by phamngoctuan on 23/05/2016.
 */
public class MyConstant {
    static public MyConstant instance = null;
    private MyConstant() {}

    static public MyConstant getInstance()
    {
        if (instance == null)
            instance = new MyConstant();
        return instance;
    }

    int ONLINE_DATA = 0;
    int OFFLINE_DATA = 1;
    int FAVORITE_DATA = 2;

    ArrayList<BookItem> _onlineData = new ArrayList<>();
    ArrayList<BookItem> _offlineData = new ArrayList<>();
}
