package drink_creators;


import drinks.Drink;

public abstract class AbstractDrinkCreator {

    public abstract Drink pourDrink();

    /*public abstract Drink pourDrink(DrinkTypes types);*/

    public String displayMessage() {
        return "Take your ";
    }
}
