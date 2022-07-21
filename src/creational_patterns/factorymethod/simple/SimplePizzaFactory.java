package creational_patterns.factorymethod.simple;

import creational_patterns.factorymethod.simple.product.ChicagoPizza;
import creational_patterns.factorymethod.simple.product.NewYorkPizza;
import creational_patterns.factorymethod.simple.product.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String pizzaName) {
        return switch (pizzaName) {
            case "ChicagoPizza" -> new ChicagoPizza();
            case "NewYorkPizza" -> new NewYorkPizza();
            default -> null;
        };
    }
}
