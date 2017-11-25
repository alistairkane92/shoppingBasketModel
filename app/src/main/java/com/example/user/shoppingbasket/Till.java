package com.example.user.shoppingbasket;

/**
 * Created by user on 25/11/2017.
 */

public class Till {
    private int funds;

    public Till(int funds) {
        this.funds = funds;
    }


    public void setFunds(int funds) {
        this.funds = funds;
    }


    public int calculateTotal(ShoppingBasket basket) {
        int total = 0;

        for (ShopItem item : basket.getItems()){
            total += item.getPrice();
        }

        discountOverTwenty(total);

        return total;
    }

    public int discountOverTwenty(int totalSpend){
        int discount = 0;

        if (totalSpend > 2000){
            discount = totalSpend / 10;
        }

        return discount;
    }



}
