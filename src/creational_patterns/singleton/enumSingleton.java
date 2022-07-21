package creational_patterns.singleton;

/**
 * 싱글톤 이게 전부다.
 *
 * 리플렉션에 안전하다.
 * enum은 리플렉션을 막는다.
 *
 * 단점은 이미 클래스 로딩 시점에 만들어진다.
 */

public enum enumSingleton {

    INSTANCE;
}
