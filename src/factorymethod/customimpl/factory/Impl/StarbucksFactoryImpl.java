package factorymethod.customimpl.factory.Impl;

import factorymethod.customimpl.common.COFFEE;
import factorymethod.customimpl.factory.CoffeeFactory;
import factorymethod.customimpl.product.Coffee;
import factorymethod.customimpl.repository.CoffeeRepository;

public class StarbucksFactoryImpl implements CoffeeFactory {

    private final CoffeeRepository coffeeRepository;

    public StarbucksFactoryImpl(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public Coffee createCoffee(COFFEE coffee) {
        System.out.println(coffee.getName() + " 만들기 시작");
        Coffee createdCoffee = coffeeRepository.findByCoffee(coffee)
                .orElseThrow(() -> new IllegalArgumentException("커피 생성 실패"));
        System.out.println(coffee.getName() + " 만들기 종료");
        return createdCoffee;
    }
}
