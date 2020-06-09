package com.example.gif_app.main.RV_Adapter;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.Object.Datum;
import com.bumptech.glide.Glide;
import com.example.gif_app.R;

import java.util.List;




public class Gif_Adapter_2
        extends RecyclerView.Adapter <Gif_Adapter_2.ViewHolder>{
    private final View.OnClickListener Parent;
    private final List<Datum> values;
    private OnInsertListener onInsertListener;

    public Gif_Adapter_2(View.OnClickListener parent, List<Datum> items) {
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
    public void onBindViewHolder(final ViewHolder holder, int position) {
        String s;
        s = values.get(position).getImages().getFixedHeight().getUrl();
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
        }
    }

}
