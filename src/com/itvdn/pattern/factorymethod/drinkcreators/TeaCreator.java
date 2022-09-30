package com.itvdn.pattern.factorymethod.drinkcreators;

import com.itvdn.pattern.factorymethod.drinks.AbstractDrink;
import com.itvdn.pattern.factorymethod.drinks.Tea;

public class TeaCreator extends AbstractDrinkCreator {
    @Override
    public AbstractDrink createDrink() {
        return new Tea();
    }

}
