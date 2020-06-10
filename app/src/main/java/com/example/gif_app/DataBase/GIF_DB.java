 package com.example.gif_app.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.Object.Datum;
import com.Object.Images;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Database(entities = {Datum.class}, version = 3, exportSchema = false)

@TypeConverters({Converters.class})
public abstract class GIF_DB extends RoomDatabase {
    public abstract GIF_DB_Dao getGifDao();

    private static volatile GIF_DB INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService dbWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static GIF_DB getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (GIF_DB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            GIF_DB.class, "database")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
