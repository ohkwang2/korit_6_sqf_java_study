package come.study.java_study.ch03_함수;

public class Function04 {

    // 같은 이름의 메소드가 2개인데, 이 경우 매개변수가 다르면 들어오는 값에 맞게 선택하여 함수 사용
    // Overloading : 동일한 함수를 호출할 때, 매개변수의 개수, 자료형, 순서에 따라 호출 함수가 달라지는 것
    void add(int a, int b) {
        System.out.println(a + b);
    }

    int add(int a, int b, int c) {
        System.out.println(a+b+c);
        return a+b+c;
    }

    //매개변수가 동일하면 안 됨.
//    void add(int a, int b, int c) {
//        System.out.println(a + b + c);
//    }

    void add (int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }
}
