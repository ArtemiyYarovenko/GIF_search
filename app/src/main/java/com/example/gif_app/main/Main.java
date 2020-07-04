package com.example.gif_app.main;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.Object.Datum;
import com.Object.API_Response;
import com.Object.Images;
import com.example.gif_app.R;
import com.example.gif_app.api.Retrofit_Item;
import com.example.gif_app.api.Retrofit_Caller;
import com.example.gif_app.DataBase.GIF_DB;
import com.example.gif_app.main.RV_Adapter.Gif_Adapter;
import com.example.gif_app.main.RV_Adapter.Gif_Adapter_2;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;



public class Main
        extends AppCompatActivity
        implements Gif_Adapter.OnInsertListener {

    private static final String api_key = "lkrJDzDTVXJtbt8lPVphAMKC05nGDLji";
    String limit = "50";
    String rating = "R";
    String offset = "0";
    int SpanCount = 2;
    Retrofit retrofit;

    private final String KEY_RECYCLER_STATE = "recycler_state";
    RecyclerView recycler_view;
    private GIF_DB DataBase;
    private EditText search_keyword;
    Button button_from_database;
    Button button_from_online;
    Gif_Adapter gif_adapter;
    GridLayoutManager gridLayoutManager;
    List<Datum> provided_values;
    Type itemsListType = new TypeToken<List<Datum>>() {}.getType();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button_from_database = findViewById(R.id.load_local);
        button_from_online = findViewById(R.id.load_online);
        search_keyword = findViewById(R.id.search_input);
        recycler_view = findViewById(R.id.recycler_view_main);

        gridLayoutManager = new GridLayoutManager(this, SpanCount);
        gridLayoutManager.setItemPrefetchEnabled(true);
        gridLayoutManager.setInitialPrefetchItemCount(6);
        recycler_view.setLayoutManager(gridLayoutManager);
        DataBase = GIF_DB.getDatabase(this);
        retrofit = Retrofit_Item.getRetrofit();

        //возращение состояния ресайклер вью
        if(savedInstanceState !=null) {
            String string = savedInstanceState.getString("zip_data");
            Gson gson = new Gson();
            provided_values = gson.fromJson(string, itemsListType);

            Gif_Adapter gif_adapter = new Gif_Adapter(this, provided_values);
            recycler_view.setAdapter(gif_adapter);
        }


        View.OnClickListener click_button_load_db = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                provided_values = DataBase.getGifDao().LoadAll();
                Gif_Adapter_2 recycler_view_adapter = new Gif_Adapter_2(this, provided_values);
                recycler_view.setAdapter(recycler_view_adapter);
            }
        };
        button_from_database.setOnClickListener(click_button_load_db);


        View.OnClickListener click_button_load_online = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String q = search_keyword.getText().toString();
                make_call(q);

            }
        };
        button_from_online.setOnClickListener(click_button_load_online);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Gson gson = new Gson();
        String string = gson.toJson(provided_values);
        savedInstanceState.putString("zip_data", string);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void make_call(String q) {
        retrofit.create(Retrofit_Caller.class)
                .getSearchPhotos(api_key, q, limit, offset, rating)
                .enqueue(new Callback<API_Response>() {

                    @Override
                    public void onResponse(Call<API_Response> call, Response<API_Response> response) {
                        assert response.body() != null;
                        provided_values = response.body().getData();
                        gif_adapter = new Gif_Adapter(Main.this,provided_values);
                        gif_adapter.setOnInsertListener(Main.this);
                        recycler_view.setAdapter(gif_adapter);
                    }

                    @Override
                    public void onFailure(Call<API_Response> call, Throwable t) {
                    }
                });
    }

    @Override
    public void onInsert(Datum datum) {
        DataBase.getGifDao().insertGif(datum);
    }


}
