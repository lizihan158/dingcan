package com.example.myapplication200.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
import com.example.myapplication200.R;
import com.example.myapplication200.model.MenuItem;

// Glide 导包
import com.bumptech.glide.Glide;

public class MenuDetailDialog extends Dialog {
    private final MenuItem menuItem;
    private final View.OnClickListener onAddClick;

    public MenuDetailDialog(Context context, MenuItem item, View.OnClickListener addListener) {
        super(context, R.style.CustomDialog);
        this.menuItem = item;
        this.onAddClick = addListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_menu_detail);
        setCancelable(true);

        ImageView ivPic = findViewById(R.id.iv_pic);

        // 用 Glide 加载商品图片
        Glide.with(getContext())
                .load(menuItem.getImage())
                .placeholder(R.drawable.food_default)
                .error(R.drawable.food_default)
                .into(ivPic);

        ((TextView)findViewById(R.id.tv_name)).setText(menuItem.name != null ? menuItem.name : "");
        ((TextView)findViewById(R.id.tv_desc)).setText(menuItem.desc != null ? menuItem.desc : "");
        ((TextView)findViewById(R.id.tv_price)).setText("￥" + menuItem.price);

        Button btnAdd = findViewById(R.id.btn_add_cart);
        btnAdd.setOnClickListener(v -> {
            if (onAddClick != null) onAddClick.onClick(v);
            dismiss();
        });
    }
}


