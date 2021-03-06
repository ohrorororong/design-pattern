package creational_patterns.factorymethod.customimpl.repository.Impl;

import creational_patterns.factorymethod.customimpl.common.COFFEE;
import creational_patterns.factorymethod.customimpl.product.starbucks.Americano;
import creational_patterns.factorymethod.customimpl.product.starbucks.Caffelatte;
import creational_patterns.factorymethod.customimpl.product.Coffee;
import creational_patterns.factorymethod.customimpl.product.starbucks.Espresso;
import creational_patterns.factorymethod.customimpl.repository.CoffeeRepository;

import java.util.HashMap;
import java.util.Optional;

import static creational_patterns.factorymethod.customimpl.common.COFFEE.*;

public class StarbucksRepositoryImpl implements CoffeeRepository {

    private final static HashMap<Long, Coffee> store = new HashMap<>();

    public StarbucksRepositoryImpl() {
        storeInit();
    }

    @Override
    public Optional<Coffee> findByCoffee(COFFEE coffee) {
        return store.values()
                .stream()
                .filter(entry -> ((Coffee) entry).getName().equals(coffee.getName()))
                .findFirst();
    }

    private void storeInit() {
        store.put(1L, new Americano(AMERICANO, 2500));
        store.put(2L, new Caffelatte(CAFFELATTE, 3500));
        store.put(3L, new Espresso(ESPRESSO, 4500));
        store.put(4L, new Espresso(CAPPUCCINO, 5500));
    }
}
