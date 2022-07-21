package creational_patterns.factorymethod.customimpl.product.starbucks;

import creational_patterns.factorymethod.customimpl.common.COFFEE;
import creational_patterns.factorymethod.customimpl.product.Coffee;

public class Cappuccino extends Coffee {
    public Cappuccino(COFFEE name, int price) {
        super(name, price);
    }
}
