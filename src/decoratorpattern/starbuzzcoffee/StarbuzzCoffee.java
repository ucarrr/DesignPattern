package decoratorpattern.starbuzzcoffee;

import java.util.logging.Handler;

//Head First Design Patterns Books Example
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $ " + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $ " + darkRoast.cost());

        Beverage houseBlend=new HouseBlend();
        houseBlend=new Soy(houseBlend);
        houseBlend=new Mocha(houseBlend);
        houseBlend=new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $ " + houseBlend.cost());


    }
}
