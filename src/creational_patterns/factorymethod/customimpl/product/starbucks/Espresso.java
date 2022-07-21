package creational_patterns.factorymethod.customimpl.product.starbucks;

import creational_patterns.factorymethod.customimpl.common.COFFEE;
import creational_patterns.factorymethod.customimpl.product.Coffee;

public class Espresso extends Coffee {
    public Espresso(COFFEE name, int price) {
        super(name, price);
    }
}
