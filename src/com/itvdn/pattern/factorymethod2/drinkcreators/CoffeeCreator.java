package com.itvdn.pattern.factorymethod2.drinkcreators;


import com.itvdn.pattern.factorymethod2.drinks.AbstractDrink;
import com.itvdn.pattern.factorymethod2.drinks.coffee.Americano;
import com.itvdn.pattern.factorymethod2.drinks.coffee.Cappuccino;
import com.itvdn.pattern.factorymethod2.drinks.coffee.Espresso;
import com.itvdn.pattern.factorymethod2.drinks.coffee.Late;
import com.itvdn.pattern.factorymethod2.drinks.type.CoffeeTypes;
import com.itvdn.pattern.factorymethod2.drinks.type.DrinkTypes;

public class CoffeeCreator extends AbstractDrinkCreator {

    @Override
    public AbstractDrink createDrink(DrinkTypes type) {
        AbstractDrink coffee = null;
        switch ((CoffeeTypes) type) {
            case ESPRESSO -> coffee = new Espresso();
            case LATE -> coffee = new Late();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case AMERICANO -> coffee = new Americano();
        }
        return coffee;
    }
}
