package com.example.gif_app.api;

import com.Object.Response2;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Retrofit_Caller {
    @GET("gifs/trending?api_key=lkrJDzDTVXJtbt8lPVphAMKC05nGDLji")
    Call<Response2>
    getRecent(@Query("limit") String given_limit, @Query("rating") String given_rating);

    // Разобраться с retorfit диннамическими запросами (либо на прямую строить url из приложения, тут подумать надо)
    @GET("gifs/search?api_key=lkrJDzDTVXJtbt8lPVphAMKC05nGDLji&q={keyword}&limit=120&offset=0&rating=G&lang=en")
    Call<Response2>
    getSearchPhotos(@Query("text") String keyWord );
}

