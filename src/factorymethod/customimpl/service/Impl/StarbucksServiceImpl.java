package factorymethod.customimpl.service.Impl;

import factorymethod.customimpl.common.COFFEE;
import factorymethod.customimpl.product.Coffee;
import factorymethod.customimpl.repository.CoffeeRepository;
import factorymethod.customimpl.service.CoffeeService;

public class StarbucksServiceImpl implements CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public StarbucksServiceImpl(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public Integer validateCoffeeAndGetPrice(COFFEE coffee) {
        return validateCoffeeAndGetCoffee(coffee)
                .getPrice();
    }

    @Override
    public void validateCoffeePrice(COFFEE coffee, Integer price) {
        validatePrice(coffee, price);
    }

    private void validatePrice(COFFEE coffee, Integer price) {
        if (validateCoffeeAndGetCoffee(coffee).getPrice() != price) {
            throw new IllegalArgumentException("계산을 다시 해주세요~");
        }
    }

    private Coffee validateCoffeeAndGetCoffee(COFFEE coffee) {
        return coffeeRepository.findByCoffee(coffee)
                .orElseThrow(() -> new IllegalArgumentException("고객님 해당 커피는 저의 매장에 없습니다."));
    }
}
