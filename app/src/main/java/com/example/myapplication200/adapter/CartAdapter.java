package com.example.myapplication200.adapter;

import android.view.*;
import android.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.myapplication200.R;
import com.example.myapplication200.model.CartItem;
import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {
    private List<CartItem> list;
    public CartAdapter(List<CartItem> list) { this.list = list; }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int type) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order_good, parent, false);
        return new ViewHolder(v);
    }
    @Override public void onBindViewHolder(ViewHolder h, int pos) {
        CartItem entry = list.get(pos);
        h.tvName.setText(entry.item.name + "  x" + entry.count);
        h.tvPrice.setText("￥" + (entry.item.price * entry.count));
        Glide.with(h.ivPic.getContext()).load(entry.item.getImage()).into(h.ivPic);
    }
    @Override public int getItemCount() { return list.size(); }
    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivPic;
        TextView tvName, tvPrice;
        public ViewHolder(View item) {
            super(item);
            ivPic = item.findViewById(R.id.ivOrderPic);
            tvName = item.findViewById(R.id.tvOrderName);
            tvPrice = item.findViewById(R.id.tvOrderPrice);
        }
    }
}

