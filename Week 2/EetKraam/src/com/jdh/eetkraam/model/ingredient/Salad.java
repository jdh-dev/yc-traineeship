package com.jdh.eetkraam.model.ingredient;

public class Salad extends Ingredient {

    /** This String represents the name of the ingredient */
    private final static String name = "Salad";

    /** This double represents the price of the ingredient */
    private static double price = 1.50;

    public Salad() {
        super(name, price);
    }
}
