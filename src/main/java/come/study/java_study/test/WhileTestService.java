package come.study.java_study.test;

import java.util.Scanner;

public class WhileTestService {
    Scanner scanner = new Scanner(System.in);
    WhileTest whileTest = new WhileTest();

    public boolean testRunt() {
        System.out.print("아이디를 입력하세요: ");
        String inputId = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String inputPassword = scanner.nextLine();

        if (authenticate(inputId, inputPassword)) {
            System.out.println("로그인 성공!");
            return false; // 인증 성공시 루프를 종료합니다.
        }
        System.out.println("아이디 또는 비밀번호가 잘못되었습니다. 다시 시도하세요.");
        return true;
    }

    // 입력한 아이디와 비밀번호가 맞는지 확인하는 메소드
    public boolean authenticate(String id, String password) {
        if(whileTest.getUserId().equals(id) && whileTest.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
