package com.example.myapplication200.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication200.R;
import com.example.myapplication200.model.CartItem;
import com.example.myapplication200.adapter.CartAdapter;
import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    private EditText etAddress;
    private RecyclerView rvOrderGoods;
    private TextView tvOrderSum, tvDeliverFee, tvOrderTotal;
    private Button btnPay;
    private ArrayList<CartItem> orderList;
    private int deliveryFee = 0;
    private double sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        etAddress = findViewById(R.id.etAddress);
        rvOrderGoods = findViewById(R.id.rvOrderGoods);
        tvOrderSum = findViewById(R.id.tvOrderSum);
        tvDeliverFee = findViewById(R.id.tvDeliverFee);
        tvOrderTotal = findViewById(R.id.tvOrderTotal);
        btnPay = findViewById(R.id.btnPay);

        orderList = (ArrayList<CartItem>) getIntent().getSerializableExtra("orderList");
        deliveryFee = getIntent().getIntExtra("deliveryFee", 0);

        if (orderList == null) orderList = new ArrayList<>();

        rvOrderGoods.setLayoutManager(new LinearLayoutManager(this));
        rvOrderGoods.setAdapter(new CartAdapter(orderList));

        sum = 0;
        for (CartItem entry : orderList) {
            sum += entry.item.price * entry.count;
        }
        tvOrderSum.setText(String.format("小计￥%.2f", sum));
        tvDeliverFee.setText(String.format("配送费￥%d", deliveryFee));
        tvOrderTotal.setText(String.format("订单总价￥%.2f", sum + deliveryFee));

        btnPay.setOnClickListener(v -> {
            String addr = etAddress.getText().toString().trim();
            if (addr.isEmpty()) {
                Toast.makeText(this, "请填写收货地址", Toast.LENGTH_SHORT).show();
            } else {
                // 跳转到PayActivity并传递必要参数
                Intent intent = new Intent(OrderActivity.this, PayActivity.class);
                intent.putExtra("address", addr);
                intent.putExtra("total", sum + deliveryFee);
                // 你可以继续putExtra其它参数（比如orderList/订单号等）
                startActivity(intent);
            }
        });
    }
}



