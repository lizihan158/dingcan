package com.example.myapplication200.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication200.R;
import com.example.myapplication200.model.MenuItem;
import com.example.myapplication200.ui.activity.BigImageActivity;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    public interface OnAddToCartListener { void onAdd(MenuItem item); }

    private final List<MenuItem> menuList;
    private final OnAddToCartListener listener;

    public MenuAdapter(List<MenuItem> menuList, OnAddToCartListener listener) {
        this.menuList = menuList;
        this.listener = listener;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int vt) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu_card, parent, false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder h, int pos) {
        MenuItem item = menuList.get(pos);

        // 所有控件都重新赋值，避免内容错位。判空处理防异常
        h.tvMenuName.setText(item.name == null ? "" : item.name);
        h.tvMenuDesc.setText(item.desc == null ? "" : item.desc);
        h.tvMenuPrice.setText("¥" + item.price);
        h.tvMenuSales.setText("月售" + item.monthlySales);

        // 加入 placeholder 和 error，防止图片错乱
        Glide.with(h.ivMenuPic.getContext())
                .load(item.getImage())
                .placeholder(R.drawable.food_default) // 用你的占位图
                .error(R.drawable.food_default)
                .into(h.ivMenuPic);

        h.btnAddToCart.setOnClickListener(v -> {
            if (listener != null) listener.onAdd(item);
        });

        // 点击图片查看大图
        h.ivMenuPic.setOnClickListener(v -> {
            Context context = h.ivMenuPic.getContext();
            Intent intent = new Intent(context, BigImageActivity.class);
            intent.putExtra("imageUrl", item.getImage());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() { return menuList == null ? 0 : menuList.size(); }

    static class MenuViewHolder extends RecyclerView.ViewHolder {
        ImageView ivMenuPic;
        TextView tvMenuName, tvMenuDesc, tvMenuPrice, tvMenuSales;
        Button btnAddToCart;

        MenuViewHolder(View itemView) {
            super(itemView);
            ivMenuPic = itemView.findViewById(R.id.ivMenuPic);
            tvMenuName = itemView.findViewById(R.id.tvMenuName);
            tvMenuDesc = itemView.findViewById(R.id.tvMenuDesc);
            tvMenuPrice = itemView.findViewById(R.id.tvMenuPrice);
            tvMenuSales = itemView.findViewById(R.id.tvMenuSales);
            btnAddToCart = itemView.findViewById(R.id.btnAddToCart);
        }
    }
}





