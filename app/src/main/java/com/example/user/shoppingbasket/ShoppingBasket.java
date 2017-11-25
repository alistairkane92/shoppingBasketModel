package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 25/11/2017.
 */

public class ShoppingBasket {
    private ArrayList<ShopItem> items;
    private int capacity;

    public ShoppingBasket(int capacity){
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public void updateCapacity() {
        this.capacity = this.capacity - getNumberOfItems();
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(ShopItem shopItem) {
        this.items.add(shopItem);
    }

    public int getNumberOfItems() {
        return this.items.size();
    }

    public void remove(ShopItem shopItem) {
        this.items.remove(shopItem);
    }

    public void empty() {
        this.items.clear();
    }
}
