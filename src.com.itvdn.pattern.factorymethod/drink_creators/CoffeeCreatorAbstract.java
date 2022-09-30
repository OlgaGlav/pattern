package drink_creators;


import drinks.Drink;
import drinks.coffee.*;
import drinks.type.CoffeeTypes;
import drinks.type.DrinkTypes;

public class CoffeeCreatorAbstract extends AbstractDrinkCreator {
    @Override
    public Drink pourDrink() {
        return new Coffee();
    }

/*    @Override
    public Drink pourDrink(DrinkTypes type) {
        Drink coffee = null;
        switch ((CoffeeTypes) type) {
            case ESPRESSO -> coffee = new Espresso();
            case LATE -> coffee = new Late();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case AMERICANO -> coffee = new Americano();
        }
        return coffee;
    }*/

    public static Drink pourDrink(DrinkTypes type) {
        Drink coffee = null;
        switch ((CoffeeTypes) type) {
            case ESPRESSO -> coffee = new Espresso();
            case LATE -> coffee = new Late();
            case CAPPUCCINO -> coffee = new Cappuccino();
            case AMERICANO -> coffee = new Americano();
        }
        return coffee;
    }
}
