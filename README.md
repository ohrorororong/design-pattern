## 목차
### 객체 생성 관련 디자인 패턴
1. 싱글톤 패턴
- 메모리 측면의 이점
- 속도 측면의 이점
- 데이터 공유가 쉽다. (동시성 문제 발생 유의!)
- 스프링의 DI Container의 싱글톤 스코프와 싱글톤 패턴은 다르다.

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
- 서로 관련있는 여러 객체를 만들어주는 인터페이스
- 구체적으로 어떤 클래스의 인스턴스를(concrete product)를 사용하는지 감출 수 있다.


- 팩토리 메서드와 추상 팩토리 패턴의 공통점은 둘 다 객체 만드는 과정을
추상화 한다.
- 팩토리 메서드 패턴은 "팩토리를 구현하는 방법"에 초점을 둔다.
- 추상 팩토리 패턴은 "팩토리를 사용하는 방법"에 초점을 둔다.
- [추상 팩토리1](https://sun-22.tistory.com/10)  
- [추상 팩토리1](https://bcp0109.tistory.com/368)
- 목적이 조금 다르다. 
    - 팩토리 메소드 패턴은 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적.
    - 추상 팩토리 패턴은 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적. 
  
  
4. 빌더 패턴
- 객체 생성 시 일정한 프로세스가 없다.
- 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법
- 빌더에다가 인스턴스를 만드는 방법을 스텝별로 만드는 것


5. 프로토타입 패턴
- 기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법
- 복제 기능을 갖추고 있는 기존 인스턴스를 프로토타입으로 사용해 새 인스턴스를 만들 수 있음
- 기존의 객체를 응용해서 새로운 인스턴스를 만들때
- 기존의 인스턴스를 프로토타입으로 사용
- 프로토타입을 사용해서 복제를 사용하면 좋은점은 동일한 작업을 반복하지 않아도 된다.
- 만약 동일한 작업이 복잡하거나 DB를 다녀오거나 네트워크를 다녀오는 리소스를 많이 소모가 심하면 기존 인스턴스를 복제해서 사용하면 이점이 많다.
- 자바가 기본적으로 제공해주는 Cloneable은 얕은 복사다. (Shallow Copy)
- 기존 인스턴스를 프로토타입으로 사용해서 새로운 인스턴스를 만드는 방법

- 장점
  - 복잡한 객체를 만드는 과정을 숨길 수 있다.
  - 기존 객체를 복제하는 과정이 새 인스턴스를 만드는 것보다 비용(시간 또는 메모리)적인 면에서 효율적일 수도 있다.
  - 추상적인 타입을 리턴할 수 있다. (clone() 메서드에서 리턴하는 타입은 해당 클래스와 동일할 필요가 없다. 유연하게 인스턴스를 만들 수 있다.)
- 단점
  - 복제한 객체를 만드는 과정 자체가 복잡할 수 있다. (특히, 순환 참조가 있는 경우)
  - clone을 만드는 그 과정이 복잡해 질 수 있다.

### 구조 관련 디자인 패턴
1. 어댑터 패턴
- 기존 코드를 클라이언트가 사용하는 인터페이스의 구혀넻로 바꿔주는 패턴
- 클라이언트가 사용하는 인터페이스를 따르지 않는 기존 코드를 재사용할 수 있게 해준다.

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