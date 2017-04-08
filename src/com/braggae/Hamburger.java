package com.braggae;

import java.util.ArrayList;

public class Hamburger extends BaseClass implements HamburgerInterface {

    protected int additionsLimit;

    private String name;
    private String meat;
    private String breadRollType;

    private double price;
    private boolean isVegan;

    private ArrayList<Addition> additions;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this(name,meat,breadRollType,price,false);
    }

    public Hamburger(String name, String meat, String breadRollType, double price, boolean isVegan) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        this.isVegan = isVegan;
        this.additionsLimit = 4;

        additions = new ArrayList<Addition>();
    }



    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public int getAdditionsLimit() {
        return additionsLimit;
    }

    public boolean isAdditionsAdded(){
        return (this.additions.size() > 0);
    }

    @Override
    public boolean isVegan() {
        if (this.isVegan) {
            for ( Addition addition:this.additions){
                if(addition.isMeat()){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double calculateBasePrice() {
        return this.price;
    }

    @Override
    public double calculateTotalPrice() {
        double totalPrice = this.calculateBasePrice();
        if(this.isAdditionsAdded()) {
            for (Addition addition : this.additions) {
                totalPrice += addition.getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public void listBaseComponents() {
        this.println(this.getMeat() + ", " + this.getBreadRollType());
    }

    @Override
    public void listAdditionalComponents() {
        if(this.isAdditionsAdded()){
            this.println("Additions:");
            for (Addition addition: this.additions){
                println(addition.getName() + " - " + addition.getPrice());
            }
        }
    }

    @Override
    public void listAllComponents() {
        if(this.isVegan()){this.printGreen("Vegan ");}
        this.println(this.getName() + " consist of: ");
        this.listBaseComponents();
        this.listAdditionalComponents();
        this.showPrice();
    }

    @Override
    public void addAddition(Addition addition) {
        if (this.additions.size() < this.getAdditionsLimit()) {
            this.additions.size();
            this.additions.add(addition);
            this.additions.size();
            this.success("Addition " + addition.getName() + " was added. \n Addition price: " + addition.getPrice());
        } else {
            this.error("Sorry, only "+ this.getAdditionsLimit() +" additions allowed.");
        }
    }

    @Override
    public void showPrice() {
        if(this.isAdditionsAdded()) this.println("Base price is: " + this.calculateBasePrice());
        this.success("Total price is: " + this.calculateTotalPrice());
    }
}
