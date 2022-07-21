package creational_patterns.factorymethod.simple;

import creational_patterns.factorymethod.simple.product.Pizza;

public class PizzaStore {

    private final SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza(String pizzaName) {
        validate(pizzaName);

        prepare(pizzaName);
        Pizza pizza = pizzaFactory.createPizza(pizzaName);
        cut(pizzaName);
        box(pizzaName);
    }

    private void validate(String pizzaName) {
        if(pizzaName.isEmpty() || pizzaName.isBlank()) {
            throw new IllegalArgumentException("주문할 피자를 입력해주세요.");
        }
    }

    private void prepare(String pizzaName) {
        System.out.println(pizzaName + " 준비 중 입니다.");
    }

    private void cut(String pizzaName) {
        System.out.println(pizzaName + " 자릅니다.");
    }

    private void box(String pizzaName) {
        System.out.println(pizzaName + " 포장합니다.");
    }
}
