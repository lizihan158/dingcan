package com.example.myapplication200.model;

import java.io.Serializable;

public class MenuItem implements Serializable {
    public int id;
    public String name;
    public String desc;
    public String image;
    public int monthlySales;
    public double price;

    public MenuItem(int id, String name, String desc, String image, int monthlySales, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.image = image;
        this.monthlySales = monthlySales;
        this.price = price;
    }

    public String getImage() {
        return image;
    }
}




