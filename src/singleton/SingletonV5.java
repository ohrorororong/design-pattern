package singleton;

/**
 * 싱글톤 패턴 권장 방법 1 (LAZY하게)
 *
 * 이 방법은 멀티스레드 환경에서 안전하고 Lazy하게 로딩할 수 있다.
 */

public class SingletonV5 {

    private SingletonV5() {} // 외부에서 인스턴스를 생성할 수 없다.

    private static class SingletonHolder {
        private static final SingletonV5 INSTANCE = new SingletonV5();
    }

    public static SingletonV5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
