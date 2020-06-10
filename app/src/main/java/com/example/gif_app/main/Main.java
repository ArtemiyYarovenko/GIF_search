package com.example.gif_app.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.Object.Datum;
import com.Object.Response2;
import com.example.gif_app.R;
import com.example.gif_app.api.Retrofit_Item;
import com.example.gif_app.api.Retrofit_Caller;
import com.example.gif_app.DataBase.GIF_DB;
import com.example.gif_app.main.RV_Adapter.Gif_Adapter;
import com.example.gif_app.main.RV_Adapter.Gif_Adapter_2;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;



public class Main
        extends AppCompatActivity
        implements Gif_Adapter.OnInsertListener {

    private static final String api_key = "lkrJDzDTVXJtbt8lPVphAMKC05nGDLji";

    private GIF_DB DataBase;
    private EditText search_keyword;
    Button button_from_database; // кнопка для загрузки базы данных
    Button button_from_online; // кнопка загрузки онлайн
    int SpanCount; // кол-во столбцов в Recycler view (планировалось сделать настройки, чтобы выбирать
                    //способ отображения (сколько стобцов, какие по размеру изображения загружать и.т.д)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button_from_database = findViewById(R.id.load_local);
        button_from_online = findViewById(R.id.load_online);
        search_keyword = findViewById(R.id.search_input);

        final RecyclerView recycler_view = findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recycler_view.setLayoutManager(gridLayoutManager);


        DataBase = GIF_DB.getDatabase(this);

        View.OnClickListener clbt = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Gif_Adapter_2 recycler_view_adapter = new Gif_Adapter_2(this, DataBase.getGifDao().LoadAll());
                recycler_view.setAdapter(recycler_view_adapter);
            }
        };

        button_from_database.setOnClickListener(clbt);


        View.OnClickListener clbto = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit r = Retrofit_Item.getRetrofit();
                String limit = "50";
                String rating = "R";
                String offset = "0";
                String q = search_keyword.getText().toString();

                r.create(Retrofit_Caller.class)
                        .getSearchPhotos(api_key, q, limit, offset, rating)
                        .enqueue(new Callback<Response2>() {

                    @Override
                    public void onResponse(Call<Response2> call, Response<Response2> response) {
                        response.body();
                    //  Log.e("test_request", String.valueOf((((Response2) response.body()).getPagination().getCount()))); Лог для проверки запрсоа
                        Gif_Adapter pa = new Gif_Adapter(this, response.body().getData());
                        pa.setOnInsertListener(Main.this);
                        recycler_view.setAdapter(pa);
                    }

                    @Override
                    public void onFailure(Call<Response2> call, Throwable t) {
                    }
                });
            }
        };
        button_from_online.setOnClickListener(clbto);
    }




    @Override
    public void onInsert(Datum datum) {
        DataBase.getGifDao().insertGif(datum);
    }

    //Хотел подумать насчет intenta, чтобы при перевороте на ландшафтный дизайн перезагружались загруженные gif-ки,
    //но потом подумал насчет разных устройств и специфики отображения на них, так как в Object есть куча форматов
    //под разные разрешения (фиксированная длина/ширина, сжатые, полноразмерные, mp4 формат есть(для лучшего качества) и т.д.
}
