package com.itvdn.pattern.factorymethod2.drinkcreators;


import com.itvdn.pattern.factorymethod2.drinks.AbstractDrink;
import com.itvdn.pattern.factorymethod2.drinks.type.DrinkTypes;

public abstract class AbstractDrinkCreator {

    public abstract AbstractDrink createDrink(DrinkTypes types);

    public String displayMessage() {
        return "Take your ";
    }
}
