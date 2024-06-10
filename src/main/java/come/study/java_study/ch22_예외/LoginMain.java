package come.study.java_study.ch22_예외;

import java.util.Scanner;

public class LoginMain {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void login(String username, String password) throws LoginException{
        // 일반적으로 .equals를 통해 참조할 때, 참조값이 null이 아닌 것을 참조 받는 대상으로 넣는게 좋음
        if(!(USERNAME.equals(username) && PASSWORD.equals(password))) {
            throw new LoginException("로그인 실패", username);   // 예외를 강제로 생성
        }
        System.out.println("로그인 성공 이후 절차 진행");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        System.out.print("사용자 이름: ");
        username = scanner.nextLine();
        System.out.print("비밀번호: ");
        password = scanner.nextLine();

        try {
            login(username, password);
        } catch (LoginException e) {    // 강제로 생성된 예외를 여기서 받아 처리
            System.out.println(e.getMessage());
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }

}
