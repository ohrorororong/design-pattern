package factorymethod.simple;

import factorymethod.simple.product.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        store.orderPizza("ChicagoPizza");
    }
}
