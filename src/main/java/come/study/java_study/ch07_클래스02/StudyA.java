package come.study.java_study.ch07_클래스02;

public class StudyA {

    int num;
    int num2;

    /*
    생성자의 특징
    1. 클래스 명과 동일하다.
    2. 리턴 자료형이 없다.
    3. 하지만, 생성자는 생성자 이름이면서 '리턴 자료형'이다.
    -> 즉 호출 시 값을 반환해준다.
    4. 생성자는 무조건 할당된 메모리의 주소를 리턴한다.
     */

    // 생성자 또한 매개 변수 값에 따라 Overloading 가능
    // NoArgsConstructor (매개 변수가 없는 생성자)
    StudyA() {
        System.out.println("스터디 에이 객체 생성");
    }

    // 생성자 또한 매개 변수 값에 따라 Overloading 가능
    // AllArgsConstructor (매개 변수를 다 가지고 있는 생성자)
    StudyA(int num, int num2) {
        System.out.println("스터디 A 객체 생성");
        // 지역 변수({}내 변수)의 우선 순위는 지역임.
        this.num = num;     //클래스 내 변수의 주소를 찾아가기 위해 this.을 사용
        this.num2 = num2;   //클래스 내 변수의 주소를 찾아가기 위해 this.을 사용
    }

    void increase(int increaseNum) {
        num += increaseNum;
        num2 += (increaseNum * 2);
    }

    void decrease(int decreaseNum) {
        num -= decreaseNum;
        num2 -= (decreaseNum * 2);
    }
}
