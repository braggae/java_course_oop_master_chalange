package com.braggae;

public class HealtyBurger extends Hamburger {

    public HealtyBurger(String name, String meat, double price, boolean isVegan) {
        super(name, meat, "brown rye bread roll", price, isVegan);
        this.additionsLimit = 6;
    }

}
