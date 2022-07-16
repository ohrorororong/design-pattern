package factorymethod.customimpl.common;

public enum COFFEE {

    AMERICANO("아메리카노"),
    CAFFELATTE("카페라떼"),
    ESPRESSO("에스프레소"),
    CAPPUCCINO("카푸치노");

    private final String name;

    COFFEE(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
