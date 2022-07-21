package creational_patterns.factorymethod.after.factory;

import creational_patterns.factorymethod.after.product.Ship;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip(); // 배 생성은 구체(하위) 클래스에 위임할거다.
        sendEmailTo(email, ship);
        return ship;
    }

    Ship createShip(); // 팩토리 역할을 하는 메서드

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
