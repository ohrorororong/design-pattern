package creational_pattern.singleton;

import java.io.Serializable;

/**
 * 직렬화, 역직렬화 사용하기
 *
 * Serializable 인터페이스에는 아무것도 없지만 역직렬화 대응 방법
 * readResolver()라는 메서드를 가지고 있으면 역직렬화 할 때 해당 메서드로 사용한다.
 * 원래는 readResolver()에서는 new SingletonV6()를 호출한다.
 *
 * 그치만 리플렉션은 대응이 안된다.
 */

public class SingletonV6 implements Serializable {

    private SingletonV6() {} // 외부에서 인스턴스를 생성할 수 없다.

    private static class SingletonHolder {
        private static final SingletonV6 INSTANCE = new SingletonV6();
    }

    public static SingletonV6 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    protected Object readResolver() {
        return getInstance();
    }
}
