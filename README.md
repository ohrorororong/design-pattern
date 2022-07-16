## 목차
### 객체 생성 관련 디자인 패턴
1. 싱글톤 패턴
- 메모리 측면의 이점
- 속도 측면의 이점
- 데이터 공유가 쉽다. (동시성 문제 발생 유의!)

2. 팩토리 메소드 패턴
- 구체적으로 어떤 인스턴스를 만들지는 서브 클래스가 정한다.
- 어떤 인스턴스를 생성하는 책임을 구체적인 클래스가 아니라 추상적인 인터페이스의 메소드로 감싸는 것이다.

장점 : 기존에 인스턴스를 만드는 과정이 담겨있는 로직을 건들지 않고
새로운 인스턴스를 다른 방법으로 확장이 가능하다.
Creator와 Product간에 관계를 느슨한 결합으로 구성했기 때문에

단점 : factory와 product의 클래스가 늘어난다.

java.util.Calendar 클래스가 Simple Factory Pattern으로 구현

스프링에서는 BeanFactory가 Factory Method Pattern으로 구현한
구현체다.

BeanFactory가 Creator다.
AnnotationConfigApplicationContext()
ClassPathXmlApplicationContext() 등등이 ConcreteCreator이다.

getBean()을 하면 ObjectType의 Product를 반환한다.

(ConcreteProduct)xxx = getBean()

3. 추상 팩토리 패턴
4. 빌더 패턴
5. 프로토타입 패턴

### 구조 관련 디자인 패턴
1. 어댑터 패턴
2. 브릿지 패턴
3. 컴포짓 패턴
4. 데코레이터 패턴
5. 퍼사드 패턴
6. 플라이웨이트 패턴
7. 프록시 패턴

### 행동 관련 디자인 패턴
1. 책임 연쇄 패턴
2. 커맨드 패턴
3. 인터프리터 패턴
4. 이터레이터 패턴
5. 중재자 패턴
6. 메멘토 패턴
7. 옵저버 패턴
8. 상태 패턴
9. 전략 패턴
10. 템플릿 메소드 패턴
11. 비지터 패턴