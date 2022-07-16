package factorymethod.customimpl.product.starbucks;

import factorymethod.customimpl.common.COFFEE;
import factorymethod.customimpl.product.Coffee;

public class Espresso extends Coffee {
    public Espresso(COFFEE name, int price) {
        super(name, price);
    }
}
