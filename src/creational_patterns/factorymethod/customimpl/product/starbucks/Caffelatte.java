package creational_patterns.factorymethod.customimpl.product.starbucks;

import creational_patterns.factorymethod.customimpl.common.COFFEE;
import creational_patterns.factorymethod.customimpl.product.Coffee;

public class Caffelatte extends Coffee {


    public Caffelatte(COFFEE coffee, int price) {
        super(coffee, price);
    }
}
