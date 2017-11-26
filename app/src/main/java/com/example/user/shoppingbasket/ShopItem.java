package com.example.user.shoppingbasket;

/**
 * Created by user on 25/11/2017.
 */

public class ShopItem {
    private boolean isBOGOF;
    private String name;
    private int price;

    public ShopItem(String name, int price, boolean isBOGOF) {
        this.name = name;
        this.price = price;
        this.isBOGOF = isBOGOF;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBOGOF() {
        return isBOGOF;
    }
}
