package com.itvdn.pattern.builder.pizza.builder;

import com.itvdn.pattern.builder.pizza.component.*;
import com.itvdn.pattern.builder.pizza.pizza.Pizza;

import java.util.Arrays;
import java.util.List;

public class PizzaBuilder implements Builder {

    protected Dough dough;
    protected Sauce sauce;
    protected List<Cheese> cheese;
    protected List<Meat> meat;
    protected List<Vegetables> vegetables;

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setCheese(Cheese ... cheese) {
        this.cheese = Arrays.asList(cheese);
    }

    public void setMeet(Meat... meat) {
        this.meat = Arrays.asList(meat);
    }

    public void setVegetables(Vegetables ... vegetables) {
        this.vegetables = Arrays.asList(vegetables);
    }

    @Override
    public Pizza getResult() {
        return new Pizza(this.dough, this.sauce, this.cheese, this.meat, this.vegetables);
    }
}