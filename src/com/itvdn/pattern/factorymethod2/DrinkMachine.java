package com.itvdn.pattern.factorymethod2;

import com.itvdn.pattern.factorymethod2.drink_creators.AbstractDrinkCreator;
import com.itvdn.pattern.factorymethod2.drink_creators.CoffeeCreator;
import com.itvdn.pattern.factorymethod2.drink_creators.TeaCreator;
import com.itvdn.pattern.factorymethod2.drinks.AbstractDrink;
import com.itvdn.pattern.factorymethod2.drinks.type.CoffeeTypes;
import com.itvdn.pattern.factorymethod2.drinks.type.TeaTypes;

public class DrinkMachine {

    public static void main(String[] args) {
        System.out.println("Lesson 2: Factory Method");

        AbstractDrinkCreator teaCreator = new TeaCreator();
        AbstractDrink tea = teaCreator.pourDrink(TeaTypes.MILK_OOLONG);

        AbstractDrinkCreator coffeeCreator = new CoffeeCreator();
        AbstractDrink coffee = coffeeCreator.pourDrink(CoffeeTypes.CAPPUCCINO);
    }
}
