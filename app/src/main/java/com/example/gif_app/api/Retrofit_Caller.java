package com.example.gif_app.api;

import com.Object.Response2;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Retrofit_Caller {
    @GET("gifs/trending?")
    Call<Response2>
    getRecent(@Query("api_key") String given_api_key,
              @Query("limit") String given_limit,
              @Query("rating") String given_rating);

    // Разобраться с retorfit диннамическими запросами (либо на прямую строить url из приложения, тут подумать надо)
    @GET("gifs/search?")
    Call<Response2>
    getSearchPhotos(@Query("api_key") String given_api_key,
                    @Query("q") String keyWord,
                    @Query("limit") String given_limit,
                    @Query("offset") String given_offset,
                    @Query("rating") String given_rating);
}

