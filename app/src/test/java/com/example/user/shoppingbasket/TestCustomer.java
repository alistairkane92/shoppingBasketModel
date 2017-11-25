package com.example.user.shoppingbasket;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/11/2017.
 */

public class TestCustomer {
    private ShoppingBasket basket = new ShoppingBasket(10);
    private Customer bob = new Customer("Bob", 50, basket, true);

    @Test
    public void testPay() throws Exception {
        bob.pay(20);
        assertEquals(30, bob.getFunds());
    }

}
