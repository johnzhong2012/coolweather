package com.todayweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by justek on 1/3/18.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
