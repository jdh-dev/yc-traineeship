package com.jdh.eetkraam.model.ingredient;

public class Cheese extends Ingredient {

    /** This String represents the name of the ingredient */
    private final static String name = "Cheese";

    /** This double represents the price of the ingredient */
    private static double price = 1.50;

    public Cheese() {
        super(name, price);
    }
}