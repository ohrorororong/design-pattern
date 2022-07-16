package factorymethod.customimpl;

import factorymethod.customimpl.common.COFFEE;
import factorymethod.customimpl.factory.CoffeeFactory;
import factorymethod.customimpl.product.Coffee;
import factorymethod.customimpl.service.CoffeeService;

public class CoffeeStore {
    // 사용자로부터 요청 받아서 커피 반환
    private final CoffeeFactory coffeeFactory;
    private final CoffeeService coffeeService;
    private COFFEE readyCoffee;

    public CoffeeStore(CoffeeFactory coffeeFactory, CoffeeService coffeeService) {
        this.coffeeFactory = coffeeFactory;
        this.coffeeService = coffeeService;
    }

    public Integer orderCoffee(COFFEE coffee) {
        readyCoffee = coffee;
        System.out.println("안녕하세요 고객님~ ");
        Integer price = coffeeService.validateCoffeeAndGetPrice(coffee);
        System.out.println("주문하신 " + coffee.getName() + " 가격은 " + price + " 입니다.");
        return price;
    }

    public Coffee createCoffee(Integer price) {
        System.out.println(price + " 받았습니다.");
        coffeeService.validateCoffeePrice(readyCoffee, price);
        System.out.println("결제가 완료되었습니다.");
        return coffeeFactory.createCoffee(readyCoffee);
    }
}
