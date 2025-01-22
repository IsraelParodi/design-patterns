package Iterator;

import Iterator.Concrete.CafeMenu;
import Iterator.Concrete.DinerMenu;
import Iterator.Concrete.PancakeHouseMenu;

// The iterator pattern provides a way to access the element of an aggregate object
// sequentially without exposing its underlying representation

// The composite pattern allows you to compose object into tree structures to represent part-whole hierarchies.
// Composite lets clients treat individual objects and composition of object uniformly
public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
