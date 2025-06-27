package com.example.myapplication200.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication200.R;

public class PayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        Button goPayBtn = findViewById(R.id.btn_go_pay);
        goPayBtn.setOnClickListener(v -> {
            Intent intent = new Intent(PayActivity.this, QrCodeActivity.class);
            startActivity(intent);
        });

        // 如果你不需要在当前界面显示二维码，这行可以删除
        // ImageView iv = findViewById(R.id.iv_qr);
        // iv.setImageResource(R.drawable.ic_qr_pay);
    }
}


