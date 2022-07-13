package creational_pattern.singleton;

/**
 * 멀티스레드 환경에서 안전하게 사용하기 위해서
 * sychronized 키워드 사용하기
 * 메서드에 synchronized를 사용하면 메서드에 한번에 하나의 스레드만 들어오게 된다.
 *
 * 단점은 getInstance()를 사용할 때 마다 동기화 메커니즘이 작동해서
 * 성능에 불이득이 생긴다.
 * 동기화 메커니즘을 뮤텍스로 생각하면 될 것 같다.
 */

public class SingletonV2 {
    private static SingletonV2 instance;

    private SingletonV2() {} // 외부에서 인스턴스를 생성할 수 없다.

    public static synchronized SingletonV2 getInstance() {
        if(instance == null) {
            instance = new SingletonV2();
        }
        return instance;
    }
}
