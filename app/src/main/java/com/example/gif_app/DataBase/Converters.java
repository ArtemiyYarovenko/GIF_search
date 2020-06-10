package com.example.gif_app.DataBase;

import androidx.room.TypeConverter;

import com.Object.Analytics;
import com.Object.Images;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

class Converters {

    @TypeConverter
    public static String StringfromImages(Images images) {
        Gson gson = new Gson();
        String json = gson.toJson(images);
        return json;
    }

    @TypeConverter
    public static Images ImagesfromString(String string){
        Type Images = new TypeToken<Images>(){}.getType();
        return new Gson().fromJson(string, Images);
    }

    @TypeConverter
    public static String StringfromAnalyctics(Analytics analytics) {
        Gson gson = new Gson();
        String json = gson.toJson(analytics);
        return json;
    }

    @TypeConverter
    public static Analytics AnalyticsfromString(String string){
        Type Analytics = new TypeToken<Analytics>(){}.getType();
        return new Gson().fromJson(string, Analytics);
    }

}
