package factorymethod.customimpl.factory;

import factorymethod.customimpl.common.COFFEE;
import factorymethod.customimpl.product.Coffee;

public interface CoffeeFactory {

    // 커피 생성
    Coffee createCoffee(COFFEE coffee);
}
