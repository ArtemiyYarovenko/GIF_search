package com.example.gif_app.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.Object.Datum;
import com.Object.Response2;
import com.example.gif_app.R;
import com.example.gif_app.api.Retrofit_Item;
import com.example.gif_app.api.Retrofit_Caller;
// import com.example.gif_app.DataBase.GIF_DB;
import com.example.gif_app.main.RV_Adapter.Gif_Adapter;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Main
        extends AppCompatActivity
        implements Gif_Adapter.OnInsertListener {

//    private GIF_DB DataBase;
    Button bt; // кнопка для загрузки базы данных
    Button bto; // кнопка загрузки онлайн
    int SpanCount; // кол-во столбцов в Recycler view (планировалось сделать настройки, чтобы выбирать
                    //способ отображения (сколько стобцов, какие по размеру изображения загружать и.т.д)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_activity);

        bt = findViewById(R.id.bt);
        bto = findViewById(R.id.bto);
        final RecyclerView rv = findViewById(R.id.rv);


        rv.setLayoutManager(new GridLayoutManager(this, 2));

//        DataBase = GIF_DB.getDatabase(getApplicationContext());

        View.OnClickListener clbt = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        //        PhotoAdapter2 pa = new PhotoAdapter2(this, DataBase.getGifDao().LoadAll());
        //        rv.setAdapter(pa);
            }
        };

        bt.setOnClickListener(clbt);


        View.OnClickListener clbto = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit r = Retrofit_Item.getRetrofit();
                String qwerty = "50";
                r.create(Retrofit_Caller.class)
                        .getRecent()
                        .enqueue(new Callback<Response2>() {

                    @Override
                    public void onResponse(Call<Response2> call, Response<Response2> response) {
                        response.body();
                    //  Log.e("b", String.valueOf((((Response2) response.body()).getPagination().getCount()))); Лог для проверки запрсоа
                        Gif_Adapter pa = new Gif_Adapter(this, response.body().getData());
                        pa.setOnInsertListener(Main.this);
                        rv.setAdapter(pa);
                    }

                    @Override
                    public void onFailure(Call<Response2> call, Throwable t) {
                    }
                });
            }
        };
        bto.setOnClickListener(clbto);

    }


    @Override
    public void onInsert(Datum datum) {
//        DataBase.getGifDao().insertPhoto(datum);
    }

    //Хотел подумать насчет intenta, чтобы при перевороте на ландшафтный дизайн перезагружались загруженные gif-ки,
    //но потом подумал насчет разных устройств и специфики отображения на них, так как в Object есть куча форматов
    //под разные разрешения (фиксированная длина/ширина, сжатые, полноразмерные, mp4 формат есть(для лучшего качества) и т.д.
}
