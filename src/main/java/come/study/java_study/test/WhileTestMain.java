package come.study.java_study.test;

public class WhileTestMain {

    public static void main(String[] args) {
        WhileTestService whileTestService = new WhileTestService();

        System.out.println("프로그램을 실행합니다.");

        while (whileTestService.testRunt()) {

        }

        System.out.println("프로그램을 종료합니다.");
    }
}