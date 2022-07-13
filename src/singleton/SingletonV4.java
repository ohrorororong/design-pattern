package singleton;

/**
 * double checked locking 사용하기
 * 변수에 volatile를 붙여야한다. 단점은 JDK 1.5 이상 작동한다.
 *
 * 또한 getInstance() 메서드 호출 시 최초 시점 빼고는 동기화 메커니즘이 작동하지 않는다.
 * 또 장점은 인스턴스를 필요한 시점에 생성할 수 있다.
 */

public class SingletonV4 {
    private static volatile SingletonV4 instance;

    private SingletonV4() {} // 외부에서 인스턴스를 생성할 수 없다.

    public static SingletonV4 getInstance() {
        if(instance == null) { // one check
            synchronized (SingletonV4.class) { // 먼저 스레드가 들어오면 다른 스레드는 여기서 대기한다.
                if(instance == null) { // two check
                    instance = new SingletonV4();
                }
            }
        }
        return instance;
    }
}
