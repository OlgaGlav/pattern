package com.itvdn.pattern.builder.pizza.builder;

import com.itvdn.pattern.builder.pizza.component.Cheese;
import com.itvdn.pattern.builder.pizza.component.Meat;
import com.itvdn.pattern.builder.pizza.component.Vegetables;
import com.itvdn.pattern.builder.pizza.pizza.Pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaManualBuilder extends PizzaBuilder implements Builder {
    private List<Cheese> cheese = new ArrayList<>();
    private List<Meat> meat= new ArrayList<>();
    private List<Vegetables> vegetables= new ArrayList<>();

      public void addCheese(Cheese ... cheeses) {
        List<Cheese> newCheeseList = new ArrayList<>();
        newCheeseList.addAll(this.cheese);
        newCheeseList.addAll(Arrays.asList(cheeses));
        this.cheese = newCheeseList;
    }

    public void addMeat(Meat ... meats) {
        List<Meat> newMeatList = new ArrayList<>();
        newMeatList.addAll(this.meat);
        newMeatList.addAll(Arrays.asList(meats));
        this.meat = newMeatList;
    }

    public void addVegetables(Vegetables ... vegetables) {
        List<Vegetables> newVegetablesList = new ArrayList<>();
        newVegetablesList.addAll(this.vegetables);
        newVegetablesList.addAll(Arrays.asList(vegetables));
        this.vegetables = newVegetablesList;
    }

    @Override
    public Pizza getResult() {
        return new Pizza(super.dough, super.sauce, cheese, meat, vegetables);
    }
}