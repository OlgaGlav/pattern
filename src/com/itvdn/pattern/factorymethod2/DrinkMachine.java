package com.itvdn.pattern.factorymethod2;

import com.itvdn.pattern.factorymethod2.drinkcreators.AbstractDrinkCreator;
import com.itvdn.pattern.factorymethod2.drinkcreators.CoffeeCreator;
import com.itvdn.pattern.factorymethod2.drinkcreators.TeaCreator;
import com.itvdn.pattern.factorymethod2.drinks.AbstractDrink;
import com.itvdn.pattern.factorymethod2.drinks.type.CoffeeTypes;
import com.itvdn.pattern.factorymethod2.drinks.type.TeaTypes;

public class DrinkMachine {
    public static void main(String[] args) {
        System.out.println("Lesson 2: Factory Method");

        AbstractDrinkCreator teaCreator = new TeaCreator();
        AbstractDrink tea = teaCreator.createDrink(TeaTypes.MILK_OOLONG);

        AbstractDrinkCreator coffeeCreator = new CoffeeCreator();
        AbstractDrink coffee = coffeeCreator.createDrink(CoffeeTypes.CAPPUCCINO);
    }
}
