package com.jdh.eetkraam.model.ingredient;

public class Bacon extends Ingredient {

    /** This String represents the name of the ingredient */
    private final static String name = "Bacon";

    /** This double represents the price of the ingredient */
    private static double price = 1.50;

    public Bacon() {
        super(name, price);
    }
}
