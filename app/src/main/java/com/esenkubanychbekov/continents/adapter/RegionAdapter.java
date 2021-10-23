package com.esenkubanychbekov.continents.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.esenkubanychbekov.continents.OnRegionClickListener;
import com.esenkubanychbekov.continents.R;
import com.esenkubanychbekov.continents.model.Region;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RegionAdapter extends RecyclerView.Adapter<RegionAdapter.ViewHolder>{

    private LayoutInflater inflater;
    private ArrayList<Region> regions;
    private OnRegionClickListener onClickListener;

    public RegionAdapter(Context context, ArrayList<Region> regions) {
        this.inflater = LayoutInflater.from(context);
        this.regions = regions;
    }

    public RegionAdapter(Context context, ArrayList<Region> regions, OnRegionClickListener onClickListener) {
        this.inflater = LayoutInflater.from(context);
        this.regions = regions;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Region region = regions.get(position);
            holder.image.setImageResource(region.getFlag());
            holder.cityName.setText(region.getName());
            holder.capital.setText(region.getCapital());
            holder.itemView.setOnClickListener(v -> {
                onClickListener.onRegionClick(region,position);
            });
    }

    @Override
    public int getItemCount() {
        return regions.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView image;
        private TextView cityName, capital;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imgFlag);
            cityName = itemView.findViewById(R.id.name);
            capital = itemView.findViewById(R.id.capital);
        }
    }
}
