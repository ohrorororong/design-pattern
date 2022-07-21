package creational_patterns.factorymethod.customimpl.product.starbucks;

import creational_patterns.factorymethod.customimpl.common.COFFEE;
import creational_patterns.factorymethod.customimpl.product.Coffee;

public class Americano extends Coffee {


    public Americano(COFFEE coffee, int price) {
        super(COFFEE.AMERICANO, 3000);
    }
}
