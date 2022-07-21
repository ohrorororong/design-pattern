package creational_patterns.factorymethod.before;

/**
 * 일반 팩토리 패턴인데
 * 문제점은 배가 추가될때 마다 밑에 코드에 추가 해야하고
 * Ship이 변경될 경우 24행 ~ 39행 문제다.
 * 점점 복잡해지고 유지보수가 어려워진다. (OCP 위반)
 *
 * 추상화 시켜 분리시키자.
 */

public class ShipFactory {

    public static Ship orderShip(String name, String email) {

        // 예외 처리
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // Customizing for specific name
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("\uD83D\uDEE5️");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("⚓");
        }

        // coloring
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        // notify
        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
