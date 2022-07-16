package factorymethod.customimpl.product.starbucks;

import factorymethod.customimpl.common.COFFEE;
import factorymethod.customimpl.product.Coffee;

public class Caffelatte extends Coffee {


    public Caffelatte(COFFEE coffee, int price) {
        super(coffee, price);
    }
}
