package com.esenkubanychbekov.continents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.esenkubanychbekov.continents.adapter.RegionAdapter;
import com.esenkubanychbekov.continents.model.Region;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    ArrayList<Region> regions = new ArrayList<>();
    RegionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        mRecyclerView = findViewById(R.id.mainRecyclerView);
        adapter = new RegionAdapter(this, regions);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);

    }

    public void setData() {
        regions.add(new Region("Европа", "", R.drawable.europe));
        regions.add(new Region("Азия", "", R.drawable.asia));
        regions.add(new Region("Африка", "", R.drawable.africa));
        regions.add(new Region("Австралия", "", R.drawable.australia));
        regions.add(new Region("Северная Америка", "", R.drawable.north_america));
        regions.add(new Region("Южная Америка", "", R.drawable.south_america));
    }
}