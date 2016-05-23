package com.example.phamngoctuan.bookcenter;

import android.graphics.Bitmap;

/**
 * Created by phamngoctuan on 23/05/2016.
 */
public class BookItem {
    private String title;
    private String imageLink;
    private Bitmap image;

    String getTitle()
    {
        return title;
    }

    void setTitle(String t)
    {
        title = t;
    }

    String getImageLink()
    {
        return imageLink;
    }

    void setImageLink(String imgL)
    {
        imageLink = imgL;
    }

    Bitmap getImage()
    {
        return image;
    }

    void setImage(Bitmap bmp)
    {
        image = bmp;
    }
}
