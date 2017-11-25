package com.example.user.shoppingbasket;

/**
 * Created by user on 25/11/2017.
 */

public class ShopItem {
    private String name;
    private int price;

    public ShopItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
