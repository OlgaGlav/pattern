package com.itvdn.pattern.factorymethod2.drink_creators;


import com.itvdn.pattern.factorymethod2.drinks.AbstractDrink;
import com.itvdn.pattern.factorymethod2.drinks.type.DrinkTypes;

public abstract class AbstractDrinkCreator {

    public abstract AbstractDrink pourDrink(DrinkTypes types);

    public String displayMessage() {
        return "Take your ";
    }
}
