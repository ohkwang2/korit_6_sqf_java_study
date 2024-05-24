package come.study.java_study.ch05_입력;

import java.util.Scanner;

public class Input02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = null;     //next()
        int age = 0;            //nextInt()
        String address = null;  //nextLine()
        String gender = null;   //next()
        String phone = null;    //nextLine()

        /*
        이름 : 김준일
        나이 : 31
        주소 : 부산 동래구 중앙대로
        성별 : 남
        연락처 : 010-9988-1916
         */

        System.out.println("이름을 입력하세요.");
        name = scanner.next();
        System.out.println("나이를 입력하세요.");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("주소를 입력하세요.");
        address = scanner.nextLine();
        System.out.println("성별을 입력하세요.");
        gender = scanner.next();
        scanner.nextLine();
        System.out.println("전화번호를 입력하세요.");
        phone = scanner.nextLine();

        System.out.println("*******");

        System.out.println("당신의 정보는 아래와 같습니다.");
        System.out.println();
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("연락처 : " + phone);
    }
}
