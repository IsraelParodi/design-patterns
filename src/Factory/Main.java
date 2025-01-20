package Factory;

import Factory.Base.Pizza;
import Factory.Base.PizzaStore;
import Factory.Chicago.ChicagoPizzaStore;
import Factory.NY.NYPizzaStore;

// The Factory Method Pattern defines an interface for creating an object,
// but lets subclasses decide with class to instantiate
// This design pattern allow us to encapsulate the instantiation of concrete types

// Dependency inversion principle -> Depend upon abstractions not concrete classes
// Our implementations should depend on abstraction instead of low level implementations

// Abstract factory pattern -> provides and interface for creating families of related or dependent objects
// without specifying their concrete classes

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
