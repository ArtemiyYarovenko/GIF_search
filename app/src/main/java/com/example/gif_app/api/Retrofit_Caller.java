package com.example.gif_app.api;

import com.Object.API_Response;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Retrofit_Caller {
    @GET("gifs/trending?")
    Call<API_Response>
    getRecent(@Query("api_key") String given_api_key,
              @Query("limit") String given_limit,
              @Query("rating") String given_rating);

    @GET("gifs/search?")
    Call<API_Response>
    getSearchPhotos(@Query("api_key") String given_api_key,
                    @Query("q") String keyWord,
                    @Query("limit") String given_limit,
                    @Query("offset") String given_offset,
                    @Query("rating") String given_rating);
}

