package com.itvdn.pattern.builder.pizza.pizza;

import com.itvdn.pattern.builder.pizza.component.*;
import lombok.Getter;

import java.util.List;
@Getter
public class Pizza {
    private final Dough dough;
    private final Sauce sauce;
    private final List<Cheese> cheese;
    private final List<Meat> meat;
    private final List<Vegetables> vegetables;

    public Pizza (Dough dough, Sauce sauce, List<Cheese> cheese, List<Meat> meat, List<Vegetables> vegetables) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.meat = meat;
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", meet=" + meat +
                ", vegetables=" + vegetables;
    }
}
