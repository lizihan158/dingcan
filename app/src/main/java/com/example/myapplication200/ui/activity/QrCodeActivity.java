package com.example.myapplication200.ui.activity;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication200.R;

// 如果需要加载二维码图片，这里用本地静态图做例子
public class QrCodeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);

        ImageView qrImage = findViewById(R.id.iv_qr_code);
        qrImage.setImageResource(R.drawable.ic_payment_qrcode); // 自己准备一个二维码图片
        // 或根据实际业务动态生成/加载二维码
    }
}

