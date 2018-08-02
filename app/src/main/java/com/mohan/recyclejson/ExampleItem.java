package com.mohan.recyclejson;

public class ExampleItem {

    private String mImageUrl;
    private String mAuthor;
    private int mLikes;


    public ExampleItem(String mImageUrl, String mAuthor, int mLikes) {
        this.mImageUrl = mImageUrl;
        this.mAuthor = mAuthor;
        this.mLikes = mLikes;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public int getmLikes() {
        return mLikes;
    }
}
