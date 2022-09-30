package com.itvdn.pattern.factorymethod2.drinks.coffee;

import com.itvdn.pattern.factorymethod2.drinks.AbstractDrink;

public class Espresso extends AbstractDrink {
    public Espresso() {
        System.out.println("Espresso");
    }
}
