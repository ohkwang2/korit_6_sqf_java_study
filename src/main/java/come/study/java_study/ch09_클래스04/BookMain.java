package come.study.java_study.ch09_클래스04;

public class BookMain {

    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");

        while(bookService.run()) {
            // 중괄호가 없으면 뒤에 명령을 실행
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
