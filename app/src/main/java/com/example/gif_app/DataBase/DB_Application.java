package com.example.gif_app.DataBase;

import android.app.Application;

import androidx.room.Room;


public class DB_Application
        extends Application {

    public static DB_Application instance;
    private GIF_DB database;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(this, GIF_DB.class, "database")
                .allowMainThreadQueries()
                .build();
    }

    public static DB_Application getInstance() {
        return instance;
    }

    public GIF_DB getDatabase() {
        return GIF_DB.getDatabase(getApplicationContext());
    }
}