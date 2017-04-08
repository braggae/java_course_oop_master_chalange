package com.braggae;

public class Addition {

    private double price;
    private String name;
    private boolean isMeat;

    public Addition(double price, String name) {
        this(price, name, false);
    }

    public Addition(double price, String name, boolean isMeat) {

        this.price = price;
        this.name = name;
        this.isMeat = isMeat;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
