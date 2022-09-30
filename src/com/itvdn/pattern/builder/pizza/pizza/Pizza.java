package com.itvdn.pattern.builder.pizza.pizza;

import com.itvdn.pattern.builder.pizza.component.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class Pizza {
    private final Dough dough;
    private final Sauce sauce;
    private final List<Cheese> cheeses;
    private final List<Meat> meats;
    private final List<Vegetables> vegetables;

    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.cheeses = builder.cheese;
        this.meats = builder.meat;
        this.vegetables = builder.vegetables;
    }

    public static class PizzaBuilder {
        private final Dough dough;
        private final Sauce sauce;
        private List<Cheese> cheese;
        private List<Meat> meat;
        private List<Vegetables> vegetables;

        public PizzaBuilder(Dough dough, Sauce sauce) {
            this.dough = dough;
            this.sauce = sauce;
        }

        public PizzaBuilder setCheese(Cheese... cheeses) {
            this.cheese = new ArrayList<>();
            this.cheese.addAll(Arrays.asList(cheeses));
            return this;
        }

        public PizzaBuilder setMeat(Meat... meats) {
            this.meat = new ArrayList<>();
            this.meat.addAll(Arrays.asList(meats));
            return this;
        }

        public PizzaBuilder setVegetables(Vegetables... vegetables) {
            this.vegetables = new ArrayList<>();
            this.vegetables.addAll(Arrays.asList(vegetables));
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheeses +
                ", meet=" + meats +
                ", vegetables=" + vegetables;
    }
}
