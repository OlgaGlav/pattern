package com.itvdn.pattern.builder.pizza.pizza;

import com.itvdn.pattern.builder.pizza.component.*;
import lombok.Builder;
import lombok.Getter;

import java.util.List;


@Getter
@Builder
public class Pizza {
    private final Dough dough;
    private final Sauce sauce;
    private final List<Cheese> cheeses;
    private final List<Meat> meats;
    private final List<Vegetables> vegetables;

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
