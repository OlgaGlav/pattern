package com.itvdn.pattern.factorymethod.drink_creators;


import com.itvdn.pattern.factorymethod.drinks.AbstractDrink;
import com.itvdn.pattern.factorymethod.drinks.Coffee;

public class CoffeeCreator extends AbstractDrinkCreator {
    @Override
    public AbstractDrink pourDrink() {
        return new Coffee();
    }
}
