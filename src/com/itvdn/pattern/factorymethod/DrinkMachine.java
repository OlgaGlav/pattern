package com.itvdn.pattern.factorymethod;

import com.itvdn.pattern.factorymethod.drinkcreators.AbstractDrinkCreator;
import com.itvdn.pattern.factorymethod.drinkcreators.CoffeeCreator;
import com.itvdn.pattern.factorymethod.drinkcreators.TeaCreator;
import com.itvdn.pattern.factorymethod.drinks.AbstractDrink;

public class DrinkMachine {
    public static void main(String[] args) {
        System.out.println("Lesson 2: Factory Method");

        AbstractDrinkCreator teaCreator = new TeaCreator();
        AbstractDrink tea = teaCreator.createDrink();

        AbstractDrinkCreator coffeeCreator = new CoffeeCreator();
        AbstractDrink coffee = coffeeCreator.createDrink();
    }
}
