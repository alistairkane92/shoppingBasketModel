package com.example.user.shoppingbasket;

/**
 * Created by user on 25/11/2017.
 */

public class Customer {
    private String name;
    private int funds;
    private ShoppingBasket basket;
    private boolean loyaltyCard;

    public Customer(String name, int funds, ShoppingBasket basket, boolean loyaltyCard) {
        this.name = name;
        this.funds = funds;
        this.basket = basket;
        this.loyaltyCard = loyaltyCard;
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

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public void pay(int amountToPay) {
        setFunds(this.funds - amountToPay);
    }

    public boolean hasLoyaltyCard() {
        return loyaltyCard;
    }

    public int getFunds() {
        return funds;
    }

    public ShoppingBasket getBasket() {
        return basket;
    }
}
