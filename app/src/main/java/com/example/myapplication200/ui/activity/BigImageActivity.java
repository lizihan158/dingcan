package com.example.myapplication200.ui.activity;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.example.myapplication200.R;

public class BigImageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_image);

        ImageView bigIv = findViewById(R.id.big_iv);
        String url = getIntent().getStringExtra("imageUrl");
        Glide.with(this).load(url).into(bigIv);
    }
}
