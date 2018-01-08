package com.todayweather.android.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by justek on 11/2/17.
 */

public class HttpUtil {
    public static final String TAG = "HttpUtil";
    public static void sendOKHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
        Log.d(TAG, "sendOKHttpRequest: " + address);
    }

}
