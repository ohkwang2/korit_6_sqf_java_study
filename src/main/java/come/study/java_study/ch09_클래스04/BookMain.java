package come.study.java_study.ch09_클래스04;

public class BookMain {

    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");

        while(bookService.run()) {
            // 중괄호가 없으면 뒤에 명령을 실행
        }

        // 조건에 해당하는 메소드가 여러개를 타고 들어갈 경우. 각각의 메소드에 void를 걸어서 return을 걸어주어야 함.
        // 그럼 중간에 계속 진행되어야 함에도 불구하고, 메소드 전체가 종료되어 버림.
        // 위 처럼 하게 되면 {}안에 실행문을 넣어 후 처리를 할 수 있음.

        System.out.println("프로그램을 종료합니다.");
    }
}
