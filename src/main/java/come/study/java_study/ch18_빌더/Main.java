package come.study.java_study.ch18_빌더;

public class Main {

    public static void main(String[] args) {
//        B b = new B(); // B 클래스는 A클래스가 생성되기 이전에 생성 불가
        // 내부 클래스
        A a = new A();
        A.B b = a.new B();  // A클래스 안에 있는 B라는 클래스를 생성

        a.test();
        b.print();

        // C가 스태틱이기 때문에 A를 생성하지 않고 바로 C를 생성 가능
        A.C c = new A.C();  // A클래스 안에 있는 C라는 클래스 생성
        c.show();

        // C가 스태틱이기 때문에 C안에 들어있는 스태틱 메소드를 바로 호출 가능.
        A.C.show2();
    }
}
