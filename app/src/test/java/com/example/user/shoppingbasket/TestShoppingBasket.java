package com.example.user.shoppingbasket;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by user on 25/11/2017.
 */

public class TestShoppingBasket {

    private ShoppingBasket basket = new ShoppingBasket(50);
    private ShopItem galaApples = new ShopItem("Gala Apples", 3, false);

    @Test
    public void testBasketAddItem() throws Exception {
        basket.add(galaApples);
        basket.updateCapacity();
        assertEquals(1, basket.getNumberOfItems());
    }

    @Test
    public void testBasketUpdateCapacity() throws Exception {
        basket.add(galaApples);
        basket.add(galaApples);
        basket.add(galaApples);
        basket.updateCapacity();
        assertEquals(47, basket.getCapacity());
    }

    @Test
    public void testBasketRemoveItem() throws Exception {
        basket.add(galaApples);
        basket.remove(galaApples);
        assertEquals(0, basket.getNumberOfItems());
    }

    @Test
    public void testBasketClearItems() throws Exception {
        basket.add(galaApples);
        basket.empty();
        assertEquals(0, basket.getNumberOfItems());
    }
}
