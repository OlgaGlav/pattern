package com.itvdn.pattern.factorymethod2.drinkcreators;

import com.itvdn.pattern.factorymethod2.drinks.AbstractDrink;
import com.itvdn.pattern.factorymethod2.drinks.tea.BlackTea;
import com.itvdn.pattern.factorymethod2.drinks.tea.GreenTea;
import com.itvdn.pattern.factorymethod2.drinks.tea.MilkOolongTea;
import com.itvdn.pattern.factorymethod2.drinks.tea.WhiteTea;
import com.itvdn.pattern.factorymethod2.drinks.type.DrinkTypes;
import com.itvdn.pattern.factorymethod2.drinks.type.TeaTypes;

public class TeaCreator extends AbstractDrinkCreator {

    @Override
    public AbstractDrink createDrink(DrinkTypes type) {
        AbstractDrink tea = null;
        switch ((TeaTypes) type) {
            case BLACK -> tea = new BlackTea();
            case GREEN -> tea = new GreenTea();
            case WHITE -> tea = new WhiteTea();
            case MILK_OOLONG -> tea = new MilkOolongTea();
        }
        return tea;
    }
}
