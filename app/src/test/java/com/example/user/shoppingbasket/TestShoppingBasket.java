package com.example.user.shoppingbasket;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 25/11/2017.
 */

public class TestShoppingBasket {

    private ShoppingBasket basket = new ShoppingBasket(50);
    private ShopItem galaApples = new ShopItem("Gala Apples", 3);

    @Test
    public void testBasketCanAddItem() throws Exception {
        basket.add(galaApples);
        basket.updateCapacity();
        assertEquals(1, basket.getNumberOfItems());
    }

    @Test
    public void testUpdateBasketCapacity() throws Exception {
        basket.add(galaApples);
        basket.add(galaApples);
        basket.add(galaApples);
        basket.updateCapacity();
        assertEquals(47, basket.getCapacity());
    }

    @Test
    public void testBasketCanRemoveItem() throws Exception {
        basket.add(galaApples);
        basket.remove(galaApples);
        assertEquals(0, basket.getNumberOfItems());
        assertEquals(50, basket.getCapacity());
    }

    @Test
    public void testBasketCanClearItems() throws Exception {
        basket.add(galaApples);
        basket.empty();
        assertEquals(0, basket.getNumberOfItems());
        assertEquals(50, basket.getCapacity());
    }


}
