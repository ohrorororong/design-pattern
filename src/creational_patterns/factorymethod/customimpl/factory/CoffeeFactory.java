package creational_patterns.factorymethod.customimpl.factory;

import creational_patterns.factorymethod.customimpl.common.COFFEE;
import creational_patterns.factorymethod.customimpl.product.Coffee;

public interface CoffeeFactory {

    // 커피 생성
    Coffee createCoffee(COFFEE coffee);
}
