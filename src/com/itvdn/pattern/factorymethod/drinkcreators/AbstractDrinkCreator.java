package com.itvdn.pattern.factorymethod.drink_creators;

import com.itvdn.pattern.factorymethod.drinks.AbstractDrink;

public abstract class AbstractDrinkCreator {

    public abstract AbstractDrink createDrink();

    public String displayMessage() {
        return "Take your ";
    }
}
