package factorymethod.simple;

import factorymethod.simple.product.ChicagoPizza;
import factorymethod.simple.product.NewYorkPizza;
import factorymethod.simple.product.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String pizzaName) {
        return switch (pizzaName) {
            case "ChicagoPizza" -> new ChicagoPizza();
            case "NewYorkPizza" -> new NewYorkPizza();
            default -> null;
        };
    }
}
