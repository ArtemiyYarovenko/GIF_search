package com.example.gif_app.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit_Item {
    private static final String BASE_URL = "https://api.giphy.com/v1/";
    private static Retrofit retrofit = null;
    private static Retrofit_Caller retrofitCaller;
    private int limit = 50;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
            return retrofit;
        }
        return retrofit;
    }

    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    public int getLimit() {

        return limit;
    }
}
