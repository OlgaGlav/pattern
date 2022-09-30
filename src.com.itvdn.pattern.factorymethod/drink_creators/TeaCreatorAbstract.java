package drink_creators;

import drinks.Drink;
import drinks.tea.Tea;

public class TeaCreatorAbstract extends AbstractDrinkCreator {
    @Override
    public Drink pourDrink() {
        return new Tea();
    }

/*    @Override
    public Drink pourDrink(DrinkTypes type) {
        Drink tea = null;
        switch ((TeaTypes) type) {
            case BLACK -> tea = new BlackTea();
            case GREEN -> tea = new GreenTea();
            case WHITE -> tea = new WhiteTea();
            case MILK_OOLONG -> tea = new MilkOolongTea();
        }
        return tea;
    }*/
}
