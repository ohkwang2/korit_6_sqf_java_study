package come.study.java_study.ch03_함수;

public class Function02 {

    // 자료형 void의 의미는 return이 없다는 의미, 그래서 함수를 호출해도 돌려주는 값이 없다는 것을 의미
    // 매개변수 x, 리턴 x
    void fx01() {
        System.out.println("fx01 함수 호출");
    }

    //매개변수 o, 리턴 x (Main에서 매개변수를 받아오는 함수)
    void fx02(int num1, int num2) {
        System.out.println("fx02 함수 호출");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }

    //매개변수 X, 리턴 O (getter, setter로 주로 활용 됨)
    String fx03() {
        String call = "매개변수가 없고 리턴이 있는 함수 호출";
        return call;
    }

    String getData() {
        return "데이터";
    }

    //매개변수 O, 리턴 O
    String 빙수만들기 (String 재료, int count) {
        return 재료 + "빙수 : " + count + "개";
    }

}
