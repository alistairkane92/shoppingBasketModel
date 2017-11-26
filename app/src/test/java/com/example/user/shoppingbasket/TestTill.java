package com.example.user.shoppingbasket;

import org.junit.Test;

import static android.R.attr.x;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/11/2017.
 */

public class TestTill {
    private Till till = new Till();

    private ShoppingBasket bobsBasket = new ShoppingBasket(10);
    private ShoppingBasket johnsBasket = new ShoppingBasket(10);

    private Customer bob = new Customer("Bob", 10000, bobsBasket, true);
    private Customer john = new Customer("John", 10000, johnsBasket, false);

    private ShopItem galaApple = new ShopItem("Gala Apples", 49, true);
    private ShopItem grannySmith = new ShopItem("Pink Lady", 39, true);
    private ShopItem blender = new ShopItem("Blender", 4000, false);
    private ShopItem champagne = new ShopItem("Champers", 2000, false);

    @Test
    public void testCalculateTotal() throws Exception {
        john.addToBasket(galaApple);
        john.addToBasket(grannySmith);
        assertEquals(88, till.calculateTotal(johnsBasket, john));
    }

    @Test
    public void testCalculateOverTwentySpendDiscount() throws Exception {
        john.addToBasket(blender);
        assertEquals(3600, till.calculateTotal(johnsBasket, john));
    }

    @Test
    public void testOnlyDiscountOverTwenty() throws Exception {
        john.addToBasket(champagne);
        assertEquals(2000, till.calculateTotal(johnsBasket, john));
    }

    @Test
    public void testLoyaltyCardDiscount() throws Exception {
        bob.addToBasket(champagne);
        assertEquals(1960, till.calculateTotal(bobsBasket, bob));
    }

    @Test
    public void testNoLoyaltyCardDiscount() throws Exception {
        john.addToBasket(champagne);
        assertEquals(2000, till.calculateTotal(johnsBasket, john));
    }

    @Test
    public void testBuyOneGetOneFree() throws Exception {
        john.addToBasket(galaApple);
        john.addToBasket(galaApple);
        assertEquals(49, till.calculateTotal(johnsBasket, john));
    }

    @Test
    public void testBuyOneGetOneFreeThreeItems() throws Exception {
        john.addToBasket(galaApple);
        john.addToBasket(galaApple);
        john.addToBasket(galaApple);
        assertEquals(98, till.calculateTotal(johnsBasket, john));
    }

    @Test
    public void testBOGOFdifferentItems() throws Exception {
        john.addToBasket(galaApple);
        john.addToBasket(grannySmith);
        assertEquals(88, till.calculateTotal(johnsBasket, john));
    }

    @Test
    public void testBuyOneGetOneFreeFourItems() throws Exception {
        john.addToBasket(galaApple);
        john.addToBasket(galaApple);
        john.addToBasket(galaApple);
        john.addToBasket(galaApple);
        assertEquals(98, till.calculateTotal(johnsBasket, john));
    }

    @Test
    public void testProcessTransaction() throws Exception {
        bob.addToBasket(galaApple);
        till.processTransaction(bobsBasket, bob);
        assertEquals(9951, bob.getFunds());
        assertEquals(0, bobsBasket.getNumberOfItems());
    }
}
