package com.example.user.shoppingbasket;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/11/2017.
 */

public class TestCustomer {
    private ShoppingBasket basket = new ShoppingBasket(10);
    private Customer bob = new Customer("Bob", 50, basket, false);
    private ShopItem apple = new ShopItem("Apple", 10, false);

    @Test
    public void testPay() throws Exception {
        bob.pay(20);
        assertEquals(30, bob.getFunds());
    }

    @Test
    public void testAddToBasket() throws Exception {
        bob.addToBasket(apple);
       assertEquals(1, bob.getBasket().getNumberOfItems());
    }

    @Test
    public void testRemoveFromBasket() throws Exception {
        bob.addToBasket(apple);
        bob.removeFromBasket(apple);
        assertEquals(0, bob.getBasket().getNumberOfItems());
    }

    @Test
    public void testEmptyBasket() throws Exception {
        bob.addToBasket(apple);
        bob.addToBasket(apple);
        bob.addToBasket(apple);
        bob.emptyBasket();
        assertEquals(0, bob.getBasket().getNumberOfItems());
    }
}
