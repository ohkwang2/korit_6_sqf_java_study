package come.study.java_study.ch07_클래스02.접근지정자;

// 패키지가 서로 다른 class를 사용하고 싶을 경우 무조건 import 해주어야 함.
import come.study.java_study.ch07_클래스02.StudyB;

public class AccessMain {
    /*
        1. private -> 같은 객체 안에서만 접근 할 수 있다.
        2. public -> 모든 영역에서 접근할 수 있다.
        3. default -> 같은 패키지 안에서만 접근 할 수 있다. (클래스나 메소드 앞에 아무 것도 안 붙인 것이 default)
        4. protected -> default와 동일한 같은 패키지 안에서 접근할 수 있고,
                        상속관계일 때에는 다른 패키지에 있어도 접근 할 수 있다.
     */

    private String test;

    public void printTest() {
        System.out.println(test);
    }

    public static void main(String[] args) {
        StudyB b = new StudyB("김준일", 31);
        b.show();
        b.setName("김준이");                   // 외부에서 private 데이터에 접근하여 값을 넣어주는 것
        System.out.println(b.getName());      // 외부에서 private 데이터를 접근하여 가져오는 것

        AccessMain accessMain = new AccessMain();
        accessMain.printTest();
        accessMain.test = "테스트";    // 같은 클래스 내에 있기 때문에 접근 가능.

//        printTest();  // 바로 접근할 수 없음 (하나의 클래스 내 다른 메소드이기 때문)
    }
}
