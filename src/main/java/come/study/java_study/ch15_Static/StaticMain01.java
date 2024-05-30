package come.study.java_study.ch15_Static;

/*
    스태틱(static)
    1. 공유 영역
    2. 스태틱 변수나 메소드는 '클래스명.변수 or 메소드' 을 통해 접근한다.
 */

public class StaticMain01 {

    public static void main(String[] args) {

        // static 변수, 메소드들은 컴파일시 메모리에 바로 할당하는 것이기 때문에 별도로 객체를 생성하지 않고 바로 객체를 불러와서 사용 가능
        // out 변수도 따라 들어가보면 static임.
        System.out.println(Static01.num);
        Static01.num = 20;
        System.out.println(Static01.num);

        Static01 static01 = new Static01();
        static01.num = 30;

        // static 영역은 새로 생성하더라도 공유된 상태로 나머지만 새로 생성됨.
        // 그래서 새로 객체 생성하고 값을 바꾸더라도 기존에 static으로 만든 변수에 대입됨
        System.out.println(static01.num);
        System.out.println(Static01.num);

    }

}
