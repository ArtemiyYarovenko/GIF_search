 package com.example.gif_app.DataBase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.Object.Datum;

import java.util.List;

//Расскоментировать, когда будут дописаны конвертеры для сложных типов данных
@Dao
public interface GIF_DB_Dao {
    @Query("SELECT * FROM Datum")
    public List<Datum>
    LoadAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void
   insertGif(Datum gif);

    @Delete
    public void
 deleteGif(Datum gif);

}
