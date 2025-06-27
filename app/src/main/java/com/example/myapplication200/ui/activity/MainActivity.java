package com.example.myapplication200.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication200.model.Shop;
import com.example.myapplication200.util.DataRepository;
import com.example.myapplication200.adapter.ShopAdapter;
import com.example.myapplication200.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvShops;
    private List<Shop> shopList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvShops = findViewById(R.id.rvShops);

        shopList = DataRepository.getShopList(this);
        rvShops.setLayoutManager(new LinearLayoutManager(this));
        ShopAdapter adapter = new ShopAdapter(shopList, shop -> {
            Intent i = new Intent(MainActivity.this, ShopDetailActivity.class);
            i.putExtra("shopId", shop.id);
            startActivity(i);
        });
        rvShops.setAdapter(adapter);
    }
}
