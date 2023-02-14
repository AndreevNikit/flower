package com.example.flower;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.time.Instant;
import java.util.List;

class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder> {
    private final static String PHOTO_URL = "http://services.hanselandpetal.com/photos/";
    private List<Flower> mFlowers;
    private Context mContext;

    FlowerAdapter(List<Flower> flowers) {

        this.mFlowers = flowers;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.first_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Flower flower = mFlowers.get(position);
        holder.nameTextView.setText(flower.getName());

        Picasso.with(mContext)
                .load(PHOTO_URL + flower.getPhoto())
                .resize(200, 150)
                .into(holder.flowerImageView);

    }

    @Override
    public int getItemCount() {
        if (mFlowers == null) {
            return 0;
        }
        return mFlowers.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        ImageView flowerImageView;

        ViewHolder(View itemView) {
            super(itemView);
            nameTextView = (TextView) itemView.findViewById(R.id.textView);
            flowerImageView = (ImageView) itemView.findViewById(R.id.Flow);
        }
    }
}