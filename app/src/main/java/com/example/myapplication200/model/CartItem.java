package com.example.myapplication200.model;

import java.io.Serializable;

public class CartItem implements Serializable {
    public MenuItem item;
    public int count;
    public CartItem(MenuItem item, int count) {
        this.item = item;
        this.count = count;
    }
}



