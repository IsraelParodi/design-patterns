package Decorator.Decorators;

import Decorator.Services.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() ==  Size.TALL) {
            cost += 0.10;
        }

        if (beverage.getSize() ==  Size.GRANDE) {
            cost += 0.15;
        }

        if (beverage.getSize() ==  Size.VENTI) {
            cost += 0.20;
        }

        return cost;
    }
}