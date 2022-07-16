package factorymethod.customimpl.product.starbucks;

import factorymethod.customimpl.common.COFFEE;
import factorymethod.customimpl.product.Coffee;

public class Cappuccino extends Coffee {
    public Cappuccino(COFFEE name, int price) {
        super(name, price);
    }
}
