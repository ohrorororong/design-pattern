package creational_patterns.factorymethod.customimpl.service;

import creational_patterns.factorymethod.customimpl.common.COFFEE;

public interface CoffeeService {
    Integer validateCoffeeAndGetPrice(COFFEE coffee);
    void validateCoffeePrice(COFFEE coffee, Integer price);
}
