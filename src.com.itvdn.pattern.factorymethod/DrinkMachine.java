import drink_creators.AbstractDrinkCreator;
import drink_creators.CoffeeCreatorAbstract;
import drink_creators.TeaCreatorAbstract;

public class DrinkMachine {

    public static void main(String[] args) {
        System.out.println("Lesson 2: Factory Method");

        AbstractDrinkCreator teaCreator = new TeaCreatorAbstract();
        System.out.print(teaCreator.displayMessage());
        teaCreator.pourDrink();

//    System.out.print(teaCreator.displayMessage());
//        teaCreator.pourDrink(TeaTypes.MILK_OOLONG);

        AbstractDrinkCreator coffeeCreator = new CoffeeCreatorAbstract();
        System.out.print(coffeeCreator.displayMessage());
        coffeeCreator.pourDrink();

//       System.out.print(coffeeCreator.displayMessage());
//        coffeeCreator.pourDrink(CoffeeTypes.CAPPUCCINO);

    }
}
