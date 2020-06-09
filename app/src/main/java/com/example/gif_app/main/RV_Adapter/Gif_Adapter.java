package com.example.gif_app.main.RV_Adapter;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.Object.Datum;
import com.Object.Response2;
import com.bumptech.glide.Glide;
import com.example.gif_app.R;


import java.util.List;

import retrofit2.Callback;

import static android.widget.Toast.LENGTH_SHORT;


public class Gif_Adapter
        extends RecyclerView.Adapter <Gif_Adapter.ViewHolder>{
    private final Callback<Response2> Parent;
    private final List<Datum> values;
    private OnInsertListener onInsertListener;

    public Gif_Adapter(Callback<Response2> parent, List<Datum> items) {
        Parent = parent;
        values = items;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String s;
        s = values.get(position).getImages().getFixedHeight().getUrl();
      // Picasso.get().load(s).into(holder.image);
       Glide.with(holder.image.getContext()).asGif().load(s).into(holder.image);
        holder.itemView.setTag(values.get(position));

    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public interface OnInsertListener {
        void onInsert(Datum datum);
    }

    public void setOnInsertListener(OnInsertListener onInsertListener) {
        this.onInsertListener = onInsertListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView image;

        ViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.iv);
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
  //                  onInsertListener.onInsert(values.get(ViewHolder.this.getAdapterPosition()));
                    Toast toast = Toast.makeText(view.getContext(), "База данных временно не работает", LENGTH_SHORT);
                    toast.show();
                }
            });
        }
    }

}
