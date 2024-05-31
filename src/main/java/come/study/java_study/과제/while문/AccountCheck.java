package come.study.java_study.과제.while문;

import java.util.Scanner;

public class AccountCheck {

    // 기존에 입력되어 있는 Id, Password
    private String userId = "admin";
    private String password = "1234";

    public void start() {
        // 프로그램 실행 시 Scanner 메모리 할당
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ 로그인 ]");

        // Id, Password 프로그램 실행 (초기 true값으로 계속 반복)
        boolean isRun = true;

        while (isRun) {
            // 사용자 ID 입력
            System.out.println("아이디를 입력하세요.");
            System.out.print("아이디: ");
            String inputId = scanner.nextLine();

            // 사용자 PW 입력
            System.out.println("비밀번호를 입력하세요.");
            System.out.print("비밀번호: ");
            String inputPassword = scanner.nextLine();

            // 사용자가 입력한 ID / PW와 기존에 입력된 ID / PW 비교
            // .eqauls를 사용하여 주소값이 아닌 입력된 값 비교.
            // 조건이 모두 참일 경우만 로그인 성공
            if (inputId.equals(userId) && inputPassword.equals(password)) {
                System.out.println("로그인 성공");
//                return; //return의 경우 if문의 조건이 만족할 때, if문 종료 (break와 동일한 역할)
                //아무것도 없는 경우 while문의 조건을 만족할 때 뒤에 내용까지 출력하고 계속해서 반복
//                continue;   // 뒤에 내용을 출력하지 않고, while문을 계속해서 반복
//                isRun = false;    //if문 조건을 만족할 경우 while문의 조건을 false로 바꿔줘서 반복을 멈추게 하기 위함
                break;    // 조건에 관계 없이 반복 종료
            }
            System.out.println("아이디 또는 비밀번호가 맞지 않습니다. 다시 입력하세요");
            System.out.println();

            continue;   // while문 자체가 조건을 만족할 때까지 계속해서 반복하므로 while에서는 사용하지 않음
//            break;  // While문에서 break가 있을 경우 첫 번째 반복에서 명령 실행 후 종료
        }
    }
}