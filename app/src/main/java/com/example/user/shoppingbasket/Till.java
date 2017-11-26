package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 25/11/2017.
 */

public class Till {

    public int calculateTotal(ShoppingBasket basket, Customer customer) {
        int total = 0;
        ArrayList<ShopItem> bogofList = new ArrayList<>();

        for (ShopItem item : basket.getItems()){
            if(!bogofList.contains(item)) {
                total += item.getPrice();
                bogofList.add(item);
            } else {
                bogofList.remove(item);
            }
        }

        total -= discountOverTwenty(total);
        total -= discountLoyaltyCard(customer, total);

        return total;
    }


    public int discountOverTwenty(int totalSpend){
        int discount = 0;

        if (totalSpend > 2000){
            discount = totalSpend / 10;
        }

        return discount;
    }


    public int discountLoyaltyCard(Customer customer, int totalSpend) {
        int discount = 0;

        if (customer.hasLoyaltyCard()){
            discount = totalSpend / 50;
        }

        return discount;
    }

    public void processTransaction(ShoppingBasket basket, Customer customer){
        customer.pay(calculateTotal(basket, customer));
        basket.empty();
    }
}
