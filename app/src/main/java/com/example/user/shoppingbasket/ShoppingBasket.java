package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 25/11/2017.
 */

public class ShoppingBasket {
    private ArrayList<ShopItem> items;

    public ShoppingBasket(ArrayList<ShopItem> items) {
        this.items = items;
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
}
