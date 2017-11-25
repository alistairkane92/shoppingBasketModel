package com.example.user.shoppingbasket;

import org.junit.Test;

import static android.R.attr.x;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 25/11/2017.
 */

public class TestTill {
    private Till till = new Till(500);
    
    private ShoppingBasket bobsBasket = new ShoppingBasket(10);
    private ShoppingBasket johnsBasket = new ShoppingBasket(10);

    private Customer bob = new Customer("Bob", 100, bobsBasket, true);
    private Customer john = new Customer("John", 0, johnsBasket, false);
    private ShopItem galaApple = new ShopItem("Gala Apples", 49);
    private ShopItem grannySmith = new ShopItem("Pink Lady", 39);
    private ShopItem blender = new ShopItem("Blender", 4000);
    private ShopItem freeCoffee = new ShopItem("Free Coffee", 0);
    private ShopItem champagne = new ShopItem("Champers", 2000);

    @Test
    public void testCalculateTotal() throws Exception {
        bob.addToBasket(galaApple);
        bob.addToBasket(grannySmith);
        assertEquals(88, till.calculateTotal(bobsBasket));
    }

    @Test
    public void testCalculateOverTwentySpendDiscount() throws Exception {
        bob.addToBasket(blender);
        int discount = till.discountOverTwenty(till.calculateTotal(bobsBasket));
        assertEquals(400, discount);
    }

    @Test
    public void testOnlyDiscountOverTwenty() throws Exception {
        bob.addToBasket(champagne);
        int discount = till.discountOverTwenty(till.calculateTotal(bobsBasket));
        assertEquals(0, discount);
    }




}
