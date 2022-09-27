package com.itvdn.pattern.builder;
import com.itvdn.pattern.builder.pizza.ManualPizza;
import com.itvdn.pattern.builder.pizza.Pizza;
import com.itvdn.pattern.builder.pizza.builder.Director;
import com.itvdn.pattern.builder.pizza.builder.PizzaBuilder;
import com.itvdn.pattern.builder.pizza.builder.PizzaManualBuilder;
import com.itvdn.pattern.builder.pizza.component.Cheese;
import com.itvdn.pattern.builder.pizza.component.Meat;
import com.itvdn.pattern.builder.pizza.component.Vegetables;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Patterns");

        PizzaBuilder builder = new PizzaBuilder();
        Director director = new Director();

        director.constructSeaPizza(builder);
        Pizza seaPizza = builder.getResult();
        System.out.println("Your order is sea pizza: " + seaPizza);

        director.constructMeatPizza(builder);
        Pizza meatPizza = builder.getResult();
        System.out.println("Your order is meat pizza: " + meatPizza);

        ManualPizza meatCheesyHotPizza;
        PizzaManualBuilder manualBuilder = new PizzaManualBuilder();
        director.constructMeatPizza(manualBuilder);
        manualBuilder.addCheese(Cheese.PARMESAN, Cheese.SMETANKOVIY);
        manualBuilder.addVegetables(Vegetables.CHILI_PEPPER, Vegetables.JALAPENO);
        manualBuilder.addMeat(Meat.PROSHUTTO);
        meatCheesyHotPizza = manualBuilder.getResult();
        System.out.println("Your order: " + meatCheesyHotPizza);
    }
}
