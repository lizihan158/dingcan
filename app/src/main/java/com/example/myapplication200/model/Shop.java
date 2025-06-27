package com.example.myapplication200.model;

import java.io.Serializable;
import java.util.List;

public class Shop implements Serializable {
    public int id;
    public String name;
    public String image;
    public double rating;
    public int monthlySales;
    public int deliveryFee;
    public String deliveryTime;
    public String announcement;
    public List<MenuItem> menuList;

    public Shop(int id, String name, String image, double rating, int monthlySales, int deliveryFee, String deliveryTime, String announcement, List<MenuItem> menuList) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.rating = rating;
        this.monthlySales = monthlySales;
        this.deliveryFee = deliveryFee;
        this.deliveryTime = deliveryTime;
        this.announcement = announcement;
        this.menuList = menuList;
    }
}



