package com.itvdn.pattern.builder;

import com.itvdn.pattern.builder.pizza.builder.Director;
import com.itvdn.pattern.builder.pizza.builder.PizzaBuilder;
import com.itvdn.pattern.builder.pizza.builder.PizzaManualBuilder;
import com.itvdn.pattern.builder.pizza.component.Cheese;
import com.itvdn.pattern.builder.pizza.component.Meat;
import com.itvdn.pattern.builder.pizza.component.Vegetables;
import com.itvdn.pattern.builder.pizza.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Patterns");

        Director director = new Director();
        PizzaBuilder builder = new PizzaBuilder();
        PizzaManualBuilder manualBuilder = new PizzaManualBuilder();


        director.constructSeaPizza(builder);
        Pizza seaPizza = builder.getResult();
        System.out.println("Your order is sea pizza: " + seaPizza);

        director.constructMeatPizza(builder);
        Pizza meatPizza = builder.getResult();
        System.out.println("Your order is meat pizza: " + meatPizza);

        director.constructMeatPizza(manualBuilder);
        manualBuilder.addCheese(Cheese.PARMESAN, Cheese.SMETANKOVIY);
        manualBuilder.addVegetables(Vegetables.CHILI_PEPPER, Vegetables.JALAPENO);
        manualBuilder.addMeat(Meat.PROSHUTTO);
        Pizza meatCheesyHotPizza = manualBuilder.getResult();
        System.out.println("Your order: " + meatCheesyHotPizza);
    }
}
