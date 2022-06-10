package com.jannatulferdousi.worldnews;

import com.jannatulferdousi.worldnews.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiresponse> {

    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);


}
