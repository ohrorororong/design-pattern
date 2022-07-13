package creational_pattern.singleton;

/**
 * 만약 synchronized 사용하지 않고 성능을 더 끌어올리고 싶으면
 * instance를 미리 생성하는 방법도 있다.
 *
 * 이 방법은 이미 클래스가 로딩되는 시점에 미리 인스턴스가 생성기 때문에
 * 멀티 스레드 환경에서도 안전하다.(safe)
 * 단점은 객체 생성 비용이 비싸서 미리 만들어 놨더니 사용하지 않는 경우 비효율적이다.
 */

public class SingletonV3 {
    private static final SingletonV3 INSTANCE = new SingletonV3(); // 이른 초기화 (eager initialization)

    private SingletonV3() {} // 외부에서 인스턴스를 생성할 수 없다.

    public static SingletonV3 getInstance() {
        return INSTANCE;
    }
}
