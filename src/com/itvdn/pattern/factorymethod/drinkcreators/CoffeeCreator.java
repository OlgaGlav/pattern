package com.itvdn.pattern.factorymethod.drinkcreators;


import com.itvdn.pattern.factorymethod.drinks.AbstractDrink;
import com.itvdn.pattern.factorymethod.drinks.Coffee;

public class CoffeeCreator extends AbstractDrinkCreator {
    @Override
    public AbstractDrink createDrink() {
        return new Coffee();
    }
}
