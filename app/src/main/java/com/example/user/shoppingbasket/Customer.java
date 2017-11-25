package com.example.user.shoppingbasket;

/**
 * Created by user on 25/11/2017.
 */

public class Customer {
    private String name;
    private int funds;
    private ShoppingBasket basket;

    public Customer(String name, int funds, ShoppingBasket basket) {
        this.name = name;
        this.funds = funds;
        this.basket = basket;

    }

    public void addToBasket(ShopItem item){
        this.basket.add(item);
    }

    public void removeFromBasket(ShopItem item){
        this.basket.remove(item);
    }

    public void emptyBasket(){
        this.basket.empty();
    }


}
