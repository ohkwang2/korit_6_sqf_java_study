package come.study.java_study.ch12_추상화03;

/*
    인터페이스
    1. 일반 클래스와 동일하게 정의할 수 없다.
    2. 일반 변수 (맴버 변수)를 정의할 수 없다.
    3. 무조건 상수만 정의할 수 있다. (변수명 앞에 final 생략 가능)
    4. 일반 메소드(맴버 메소드)를 정의하기 위해서는 default 키워드를 사용하여야 한다.
    5. 추상 메소드를 정의할 때, abstract 키워드를 생략할 수 있다.
    6. 인터페이스 안에 정의되어지는 모든 상수와 메소드들은 public 접근 지정자를 사용한다.
    7. 인터페이스끼리는 상속해서 사용 가능 (??)
    8. 인터페이스는 여러개 상속 가능 (implement, ...)
 */

public interface Authority {
    String DEFAULT_DOLRE = "ROLE_USER";

    // public abstract 생략
    String getAuthority();

    // public 생략
    // default ??? 인터페이스에서 default가 뭔지 찾아봐야함.
    // 일반 메소드를 만드려면 default를 붙여야 한다.
    default void printAuthority() {
        System.out.println(DEFAULT_DOLRE);
    }
}
