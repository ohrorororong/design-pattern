package factorymethod.customimpl.product.starbucks;

import factorymethod.customimpl.common.COFFEE;
import factorymethod.customimpl.product.Coffee;

public class Americano extends Coffee {


    public Americano(COFFEE coffee, int price) {
        super(COFFEE.AMERICANO, 3000);
    }
}
