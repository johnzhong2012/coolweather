package com.todayweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by justek on 1/3/18.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
