package com.esenkubanychbekov.continents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.esenkubanychbekov.continents.adapter.RegionAdapter;
import com.esenkubanychbekov.continents.model.Region;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RegionAdapter adapter;
    private Region region;
    private ArrayList<Region> mRegions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        createList();
        recyclerView = findViewById(R.id.detailRecyclerView);
        adapter = new RegionAdapter(this, mRegions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Region> createList() {
        int id = getIntent().getIntExtra(MainActivity.KEY, 1);
        if (1 == id){
            mRegions.add(new Region("Австрия","Вена",R.drawable.austria));
            mRegions.add(new Region("Словения","Любляна",R.drawable.sloveniya));
            mRegions.add(new Region("Турция","Анкара",R.drawable.tr));
            mRegions.add(new Region("Исландия","Рейкьявик",R.drawable.is));
            mRegions.add(new Region("Греция","Афины",R.drawable.gr));
            mRegions.add(new Region("Хорватия","Загреб",R.drawable.hr));
            mRegions.add(new Region("Франция","Париж",R.drawable.fr));
            mRegions.add(new Region("Норвегия","Осло",R.drawable.no));
            mRegions.add(new Region("Италия","Рим",R.drawable.it));
            mRegions.add(new Region("Испания","Мадрид",R.drawable.es));
        }else if (2 == id) {
            mRegions.add(new Region("Кыргызстан","Бишкек",R.drawable.kg));
            mRegions.add(new Region("Япония","Токио",R.drawable.japan));
            mRegions.add(new Region("Китай","Пекин",R.drawable.hk));
            mRegions.add(new Region("Казахстан","Астана",R.drawable.kz));
            mRegions.add(new Region("Узбекистан","Ташкент",R.drawable.uz));
            mRegions.add(new Region("Малайзия","Куала-Лумпур",R.drawable.my));
            mRegions.add(new Region("Индия","Дели",R.drawable.in));
            mRegions.add(new Region("Пакистан","Исламабад",R.drawable.pk));
            mRegions.add(new Region("Корея","Сеул",R.drawable.kr));
            mRegions.add(new Region("Монголия","Улан-Батор",R.drawable.mn));
        }else if (3 == id){
            mRegions.add(new Region("Египет","Каир",R.drawable.eg));
            mRegions.add(new Region("Южная Африка","Кейптаун",R.drawable.za));
            mRegions.add(new Region("Марокко","Рабат",R.drawable.ma));
            mRegions.add(new Region("Эфиопия","Аддис-Абеба",R.drawable.et));
            mRegions.add(new Region("Кения","Найроби",R.drawable.ke));
            mRegions.add(new Region("Руанда","Кигали",R.drawable.rw));
            mRegions.add(new Region("Танзания","Додома",R.drawable.tz));
            mRegions.add(new Region("Нигерия","Абуджа",R.drawable.ng));
            mRegions.add(new Region("Гана","Аккра",R.drawable.gn));
            mRegions.add(new Region("Кот-д'Ивуар","Вена",R.drawable.ci));
        }else if (4 == id){
            mRegions.add(new Region("Hello","Вена",R.drawable.australia));
        }else{
            Toast.makeText(this, "Error status:", Toast.LENGTH_SHORT).show();
        }
        return mRegions;
    }

}