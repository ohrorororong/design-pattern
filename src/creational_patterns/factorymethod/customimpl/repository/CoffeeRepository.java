package creational_patterns.factorymethod.customimpl.repository;

import creational_patterns.factorymethod.customimpl.common.COFFEE;
import creational_patterns.factorymethod.customimpl.product.Coffee;

import java.util.Optional;

public interface CoffeeRepository {
    Optional<Coffee> findByCoffee(COFFEE coffee);

}
