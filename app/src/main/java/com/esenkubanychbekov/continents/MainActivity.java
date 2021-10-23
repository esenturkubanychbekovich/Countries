package com.esenkubanychbekov.continents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.esenkubanychbekov.continents.adapter.RegionAdapter;
import com.esenkubanychbekov.continents.model.Region;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    ArrayList<Region> regions = new ArrayList<>();
    RegionAdapter adapter;
    private OnRegionClickListener clickListener;
    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        mRecyclerView = findViewById(R.id.mainRecyclerView);
        clickListener = new OnRegionClickListener() {
            @Override
            public void onRegionClick(Region region, int position) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(KEY, region.getId());
                startActivity(intent);
            }
        };
        adapter = new RegionAdapter(this, regions, clickListener);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);

    }

    public void setData() {
        regions.add(new Region(1,"Европа", "", R.drawable.europe));
        regions.add(new Region(2,"Азия", "", R.drawable.asia));
        regions.add(new Region(3,"Африка", "", R.drawable.africa));
        regions.add(new Region(4,"Австралия", "", R.drawable.australia));
        regions.add(new Region(5,"Северная Америка", "", R.drawable.north_america));
        regions.add(new Region(6,"Южная Америка", "", R.drawable.south_america));
    }


}
