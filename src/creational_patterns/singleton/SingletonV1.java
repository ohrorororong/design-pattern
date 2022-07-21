package creational_patterns.singleton;

/**
 * SingletonV1은 멀티스레드 환경에서 안전하지 않다.
 */

public class SingletonV1 {
    private static SingletonV1 instance;

    private SingletonV1() {} // 외부에서 인스턴스를 생성할 수 없다.

    public static SingletonV1 getInstance() {
        if(instance == null) { // not safe
            instance = new SingletonV1();
        }
        return instance;
    }
}
