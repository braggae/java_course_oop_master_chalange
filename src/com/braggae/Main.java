package com.braggae;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Hamburger", "Котлета", "Біла булка", 1.95);
        hamburger.listAllComponents();
        System.out.println("-------------------------------------------------");
        hamburger.addAddition(new Addition(0.65,"Екстра котлета"));
        System.out.println("-------------------------------------------------");
        hamburger.listAllComponents();

        System.out.println("-------------------------------------------------");

        Hamburger deluxe = new DeluxeBurger("Hamburger menu","Велика котлета","Біла булка",1.55, false);
        deluxe.listAllComponents();

        System.out.println("-------------------------------------------------");

        Hamburger veganBurger = new HealtyBurger("Vegan Burger","Fried Cheese",0.99,true);
        veganBurger.addAddition(new Addition(0.99,"Sprite"));
        veganBurger.addAddition(new Addition(0.35,"Spicy souse"));
        veganBurger.addAddition(new Addition(0.35,"Ketchup"));
        veganBurger.addAddition(new Addition(0.45,"Piccles"));
        veganBurger.addAddition(new Addition(0.78,"Cheese"));
        veganBurger.addAddition(new Addition(0.15,"Extra onions"));
        veganBurger.addAddition(new Addition(1.15,"Meat Cotlet"));
        veganBurger.addAddition(new Addition(1.15,"Meat Cotlet"));
        veganBurger.addAddition(new Addition(1.15,"Meat Cotlet"));
        veganBurger.addAddition(new Addition(1.15,"Meat Cotlet"));
    }
}
