package factorymethod.customimpl.service;

import factorymethod.customimpl.common.COFFEE;

public interface CoffeeService {
    Integer validateCoffeeAndGetPrice(COFFEE coffee);
    void validateCoffeePrice(COFFEE coffee, Integer price);
}
