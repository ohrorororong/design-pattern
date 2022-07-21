package creational_patterns.factorymethod.customimpl;

import creational_patterns.factorymethod.customimpl.config.AppConfig;
import creational_patterns.factorymethod.customimpl.product.Coffee;

import static creational_patterns.factorymethod.customimpl.common.COFFEE.*;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = AppConfig.getInstance().coffeeStore();
        Integer price = coffeeStore.orderCoffee(CAPPUCCINO);
        Coffee coffee = coffeeStore.createCoffee(price);
        System.out.println(coffee);
    }
}
