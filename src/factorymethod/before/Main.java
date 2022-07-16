package factorymethod.before;


/**
 * 일반 팩토리 패턴을 생각해보면??
 *
 * 인자로 생성할 인스턴스명을 넘길때 if else 문이 계속 추가되고 유지보수가 어렵다.
 * 하나의 구체 클래스(concrete)에서 모두 처리하기 복잡하다.
 *
 * 해결법
 * 1. 팩토리 인터페이스를 만든다.
 * 2. 기본적인 구현을 만든 후 일부 바뀌어야 하는 부분은 추상 메서드로 뺀다.
 * 3. 구체 클래스에서 추상 메서드를 구현한다.
 * 4. Product(제품군)도 인터페이스로 만든다.
 * 5. 팩토리의 구체 클래스에서 구체 제품군을 사용한다.
 */

public class Main {
    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "hasfw@naver.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "hasfw@naver.com");
        System.out.println(blackship);
    }
}
