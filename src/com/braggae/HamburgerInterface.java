package com.braggae;

public interface HamburgerInterface {

    boolean isVegan();

    double calculateBasePrice();

    double calculateTotalPrice();

    void showPrice();

    void listBaseComponents();

    void listAdditionalComponents();

    void listAllComponents();

    /**
     *
     * @param addition addition of burger
     */
    void addAddition(Addition addition);


}
