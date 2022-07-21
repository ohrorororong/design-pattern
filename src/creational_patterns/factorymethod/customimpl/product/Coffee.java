package creational_patterns.factorymethod.customimpl.product;

import creational_patterns.factorymethod.customimpl.common.COFFEE;

public abstract class Coffee {
    private final COFFEE name;
    private final int price;
    private String introduce;

    public Coffee(COFFEE name, int price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name.getName();
    }

    public int getPrice() {
        return price;
    }

    public String getIntroduce() {
        return introduce;
    }


    @Override
    public String toString() {
        return "Coffee{" +
                "name=" + name +
                ", price=" + price +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}
