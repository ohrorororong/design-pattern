package factorymethod.customimpl.repository;

import factorymethod.customimpl.common.COFFEE;
import factorymethod.customimpl.product.Coffee;

import java.util.Optional;

public interface CoffeeRepository {
    Optional<Coffee> findByCoffee(COFFEE coffee);

}
