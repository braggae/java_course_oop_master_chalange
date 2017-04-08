package com.braggae;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String name, String meat, String breadRollType, double price, boolean isVegan) {
        super(name, meat, breadRollType, price, isVegan);
        this.additionsLimit = 2;
        this.addAddition(new Addition(1.20, "Chips"));
        this.addAddition(new Addition(0.99, "Cola"));
    }
}
