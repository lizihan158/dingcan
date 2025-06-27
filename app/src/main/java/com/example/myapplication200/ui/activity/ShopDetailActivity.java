package com.example.myapplication200.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication200.R;
import com.example.myapplication200.model.*;
import com.example.myapplication200.util.DataRepository;
import com.example.myapplication200.adapter.MenuAdapter;
import java.util.*;

public class ShopDetailActivity extends AppCompatActivity {
    private RecyclerView rvMenu;
    private ImageView ivShopDetailHead;
    private TextView tvShopDetailName, tvShopDetailAnn, tvCartNum;
    private TextView tvOrderSum, tvOrderTotal, tvDeliverFee;
    private Button btnPay;
    private Shop shop;
    private List<MenuItem> menuList;
    private Map<MenuItem, Integer> cartMap = new HashMap<>();
    private int shopDeliveryFee = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_detail);

        rvMenu = findViewById(R.id.rvMenu);
        ivShopDetailHead = findViewById(R.id.ivShopDetailHead);
        tvShopDetailName = findViewById(R.id.tvShopDetailName);
        tvShopDetailAnn = findViewById(R.id.tvShopDetailAnn);

        // 下方几个是关键！要和XML里存在的id一致
        tvCartNum = findViewById(R.id.tvCartNum);
        tvOrderSum = findViewById(R.id.tvOrderSum);         // 小计
        tvOrderTotal = findViewById(R.id.tvOrderTotal);     // 订单总价
        tvDeliverFee = findViewById(R.id.tvDeliverFee);     // 配送费
        btnPay = findViewById(R.id.btnPay);                 // 去支付按钮

        int shopId = getIntent().getIntExtra("shopId", -1);
        Shop found = null;
        for (Shop s : DataRepository.getShopList(this)) {
            if (s.id == shopId) { found = s; break; }
        }
        shop = found;
        if (shop == null) finish();

        Glide.with(this).load(shop.image).into(ivShopDetailHead);
        tvShopDetailName.setText(shop.name);
        tvShopDetailAnn.setText(shop.deliveryTime + " | " + shop.announcement);

        menuList = shop.menuList;
        shopDeliveryFee = shop.deliveryFee;

        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        MenuAdapter menuAdapter = new MenuAdapter(menuList, item -> {
            int c = cartMap.containsKey(item) ? cartMap.get(item) : 0;
            cartMap.put(item, c + 1);
            updateCartUI();
        });
        rvMenu.setAdapter(menuAdapter);
        updateCartUI();

        btnPay.setOnClickListener(v -> {
            if (cartMap.isEmpty()) {
                Toast.makeText(this, "请先选择商品", Toast.LENGTH_SHORT).show();
            } else {
                Intent it = new Intent(this, OrderActivity.class);
                ArrayList<CartItem> orderList = new ArrayList<>();
                for (MenuItem k : cartMap.keySet())
                    orderList.add(new CartItem(k, cartMap.get(k)));
                it.putExtra("orderList", orderList);
                it.putExtra("deliveryFee", shopDeliveryFee);
                startActivity(it);
            }
        });
    }

    private void updateCartUI() {
        int num = 0;
        double sum = 0;
        for (MenuItem k : cartMap.keySet()) {
            int c = cartMap.get(k);
            num += c;
            sum += k.price * c;
        }
        // 设置购物车数量红点
        if (num > 0) {
            tvCartNum.setVisibility(TextView.VISIBLE);
            tvCartNum.setText(String.valueOf(num));
        } else {
            tvCartNum.setVisibility(TextView.GONE);
        }

        // 小计
        tvOrderSum.setText("小计￥" + sum);

        // 配送费
        tvDeliverFee.setText("配送费￥" + shopDeliveryFee);

        // 订单总价（小计+配送费）
        tvOrderTotal.setText("订单总价￥" + (sum + shopDeliveryFee));

        // 按需可禁用“去支付”按钮(无商品不可支付)
        btnPay.setEnabled(num > 0);
    }
}



