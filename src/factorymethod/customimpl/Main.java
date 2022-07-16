package factorymethod.customimpl;

import factorymethod.customimpl.config.AppConfig;
import factorymethod.customimpl.product.Coffee;

import static factorymethod.customimpl.common.COFFEE.*;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = AppConfig.getInstance().coffeeStore();
        Integer price = coffeeStore.orderCoffee(CAPPUCCINO);
        Coffee coffee = coffeeStore.createCoffee(price);
        System.out.println(coffee);
    }
}
