package com.itvdn.pattern.builder;

import com.itvdn.pattern.builder.pizza.component.Cheese;
import com.itvdn.pattern.builder.pizza.component.Dough;
import com.itvdn.pattern.builder.pizza.component.Meat;
import com.itvdn.pattern.builder.pizza.component.Sauce;
import com.itvdn.pattern.builder.pizza.pizza.Pizza;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder(
                Dough.THICK, Sauce.RED)
                .setCheese(Cheese.CHEDDER, Cheese.PARMESAN)
                .setMeat(Meat.SALAMI, Meat.SMOKED_CHICKEN)
                .build();

        System.out.println(pizza);
    }
}
