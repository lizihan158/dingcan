package com.example.myapplication200.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.myapplication200.R;
import com.example.myapplication200.model.Shop;
import java.util.List;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder> {
    public interface OnItemClickListener { void onClick(Shop shop); }
    private List<Shop> shopList;
    private OnItemClickListener listener;

    public ShopAdapter(List<Shop> shopList, OnItemClickListener listener) { this.shopList = shopList; this.listener = listener; }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int type) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shop_card, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder h, int pos) {
        Shop s = shopList.get(pos);
        Log.d("test",s.name+"image = " + s.image);
        h.tvShopName.setText(s.name);
        h.tvShopDescr.setText("评分 " + s.rating + " | 月售" + s.monthlySales + "单 | 配送 " + s.deliveryFee + "元");
        h.tvShopAnn.setText(s.announcement);
        h.tvShopTime.setText(s.deliveryTime);
        Glide.with(h.ivShop.getContext()).load(s.image).into(h.ivShop);
        h.itemView.setOnClickListener(v -> listener.onClick(s));
    }

    @Override public int getItemCount() { return shopList.size(); }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivShop;
        TextView tvShopName, tvShopDescr, tvShopAnn, tvShopTime;
        CardView card;
        ViewHolder(View item) {
            super(item);
            card = item.findViewById(R.id.cardShop);
            ivShop = item.findViewById(R.id.ivShopPic);
            tvShopName = item.findViewById(R.id.tvShopName);
            tvShopDescr = item.findViewById(R.id.tvShopDescr);
            tvShopAnn = item.findViewById(R.id.tvShopAnnounce);
            tvShopTime = item.findViewById(R.id.tvShopTime);
        }
    }
}


