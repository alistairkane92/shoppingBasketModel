package com.example.user.shoppingbasket;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 25/11/2017.
 */

public class TestShoppingBasket {

    private ShoppingBasket basket = new ShoppingBasket(new ArrayList<ShopItem>());
    private ShopItem galaApples = new ShopItem("Gala Apples", 3);

    @Test
    public void testBasketCanAddItem() throws Exception {
        basket.add(galaApples);
        assertEquals(1, basket.getNumberOfItems());
    }

    @Test
    public void testBasketCanRemoveItem() throws Exception {
        basket.add(galaApples);
        basket.remove(galaApples);
        assertEquals(0, basket.getNumberOfItems());
    }

}
