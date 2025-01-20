package Decorator;

// The decorator pattern attaches additional responsabilities to an object dynamically.
// Provides a flexible alternative to subclassing
// this follow the open close principle

import Decorator.Decorators.Mocha;
import Decorator.Decorators.Whip;
import Decorator.Decorators.Soy;
import Decorator.Services.Beverage;
import Decorator.Services.DarkRoast;
import Decorator.Services.Espresso;
import Decorator.Services.HouseBlend;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(Beverage.Size.VENTI);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
