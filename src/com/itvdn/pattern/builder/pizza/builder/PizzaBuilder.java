package com.itvdn.pattern.builder.pizza.builder;

import com.itvdn.pattern.builder.pizza.Pizza;
import com.itvdn.pattern.builder.pizza.component.*;

import java.util.Arrays;
import java.util.List;

public class PizzaBuilder implements Builder {

    private Dough dough;
    private Sauce sauce;
    private List<Cheese> cheese;
    private List<Meat> meat;
    private List<Vegetables> vegetables;

    @Override
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    @Override
    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    @Override
    public void setCheese(Cheese ... cheese) {
        this.cheese = Arrays.asList(cheese);
    }

    @Override
    public void setMeet(Meat... meat) {
        this.meat = Arrays.asList(meat);
    }

    @Override
    public void setVegetables(Vegetables ... vegetables) {
        this.vegetables = Arrays.asList(vegetables);
    }

    public Pizza getResult() {
        return new Pizza(this.dough, this.sauce, this.cheese, this.meat, this.vegetables);
    }
}
