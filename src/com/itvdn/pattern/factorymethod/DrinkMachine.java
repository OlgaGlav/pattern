package com.itvdn.pattern.factorymethod;

import com.itvdn.pattern.factorymethod.drink_creators.AbstractDrinkCreator;
import com.itvdn.pattern.factorymethod.drink_creators.CoffeeCreator;
import com.itvdn.pattern.factorymethod.drink_creators.TeaCreator;
import com.itvdn.pattern.factorymethod.drinks.AbstractDrink;

public class DrinkMachine {

    public static void main(String[] args) {
        System.out.println("Lesson 2: Factory Method");

        AbstractDrinkCreator teaCreator = new TeaCreator();
        AbstractDrink tea = teaCreator.pourDrink();

        AbstractDrinkCreator coffeeCreator = new CoffeeCreator();
        AbstractDrink coffee = coffeeCreator.pourDrink();
    }
}
