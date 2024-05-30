package come.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA{

    @Override
    // 의존관계 (print메소드가 InterfaceA interfaceA를 의존한다.
    // <- 이런 경우의 해당 객체를 DI (depandency Interface)라고 함
    public void print(InterfaceA interfaceA) {
        // 외부에서 객체가 대입됨.
        System.out.println("A1 클래스에서 print 호출");
        interfaceA.test();
    }
}
