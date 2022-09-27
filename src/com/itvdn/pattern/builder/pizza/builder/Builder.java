package com.itvdn.pattern.builder.pizza.builder;

import com.itvdn.pattern.builder.pizza.component.*;

public interface Builder {
    void setDough(Dough dough);
    void setSauce(Sauce sauce);
    void setCheese(Cheese... cheese);
    void setMeet(Meat... meat);
    void setVegetables(Vegetables... vegetables);
}
