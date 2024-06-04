package come.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {

    // 프로그램 시작
    // 도서명, 저자명 3번 받아옴 (도서명: 도서1, 저자명: 저자1, 도서명: 도서2, 저자명: 저자2, 도서명: 도서3, 저자명: 저자3)

    // new Book("도서명", "저자명")
    // BookList에 추가

    // 도서 전체 조회 (도서명 >> 도서1~3, 저자명 >> 저자1~3) <- ToStriing 쓰지말고, 반복 돌려서 출력

    // 삭제할 도서명 : 도서2
    // 도서명 >> 도서1, 3
    // 저자명 >> 저자1, 3

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> bookList = new ArrayList<>();

        System.out.println("프로그램 시작");

        // 리스트에 객체 생성해서 담기
        for(int i = 0; i < 3; i++) {
            String bookName;
            String author;
            System.out.print("도서명: ");
            bookName = scanner.nextLine();
            System.out.print("저자명: ");
            author = scanner.nextLine();

            bookList.add(new Book(bookName, author));
        }

        // 도서 전체 조회
        for(Book book : bookList) {
            System.out.println("도서명: " + book.getBookName());
            System.out.println("저자명: " + book.getAuthor());
        }

        // 도서 삭제
        // 삭제할 때 지우고나서 break;안 걸면 에러남
        // 크기를 줄이면서 배열 주소가 바뀌기 때문에 돌리던 주소가 중간에 바뀌고, for문이 고장남
        // 이름 기반 삭제
        System.out.print("삭제할 도서명: ");
        String removeBookName = scanner.nextLine();
        for(Book book : bookList) {
            if(book.getBookName().equals(removeBookName)) {
                bookList.remove(book);
                break;  // 삭제시에 break 필수
            }
        }

        // 인덱스 기반 삭제
        for(int i = 0; i < bookList.size(); i++) {
            //.get() <- 배열의 인덱스 참조와 동일
            if(bookList.get(i).getBookName().equals(removeBookName)) {
                Book remobeBook = bookList.remove(i);
                System.out.println("삭제된 도서 정보: " + remobeBook);
                break;
            }
        }

        for (int i = 0; i < bookList.size(); i++) {
            //.get() <- 배열의 인덱스 참조와 동일
            System.out.println("도서명: " + bookList.get(i).getBookName());
            System.out.println("도서명: " + bookList.get(i).getAuthor());
        }


    }


}
