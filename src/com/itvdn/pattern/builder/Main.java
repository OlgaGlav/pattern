package com.itvdn.pattern.builder;

import com.itvdn.pattern.builder.pizza.component.Cheese;
import com.itvdn.pattern.builder.pizza.component.Dough;
import com.itvdn.pattern.builder.pizza.component.Meat;
import com.itvdn.pattern.builder.pizza.component.Sauce;
import com.itvdn.pattern.builder.pizza.pizza.Pizza;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .dough(Dough.THICK)
                .sauce(Sauce.RED)
                .cheeses(Arrays.asList(Cheese.CHEDDER, Cheese.PARMESAN))
                .meats(Arrays.asList(Meat.SALAMI, Meat.SMOKED_CHICKEN))
                .build();

        System.out.println(pizza);
    }
}
