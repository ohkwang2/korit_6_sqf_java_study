package come.study.java_study.ch09_클래스04;

import java.awt.print.Book;

// 저장소 -> CRUD
public class BookRepository {

    private BookEntity[] books;

    // BookRepository가 생성됨과 동시에 기본 정보를 넣어놓기 위함.
    public BookRepository() {
        books = new BookEntity[0];
    }

    // 기능으로 따지자면 배열을 늘리는 기능 (해당 클래스 내에서만 쓰기 때문에 private으로 생성
    private void extendBooks() {
        // 기본 배열보다 크기가 하나 더 큰 배열을 생성
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈 값이다.
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        // 기존의 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입.
        books = newBooks;
        newBooks = null;
    }

    // 마지막 인덱스를 가져오는 함수
    private int getLastIndex() {
        return books.length - 1;
    }

    // 기능으로 따지면 새로운 배열에 객체 대입
    public void saveBook(BookEntity book) {
        // 배열 확장
        extendBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;
    }

    // 단건 조회
    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null;
        // 선형 탐색
        for(BookEntity book : books) {
            if(book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    // 단건 조회 (책 이름이 중복이 허용 될 경우 같은 이름의 책 중 가장 빠른 책 한 권만 조회됨)
    public BookEntity findBookByName(String bookName) {
        BookEntity findBook = null;
        //선형탐색
        for(BookEntity book : books) {
            // 주소가 아닌 문자열을 비교하는 것이기 떄문에 equals를 사용.
            if(book.getBookName().equals(bookName)) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1: // 통합 검색
                for(BookEntity book : books) {
                    // .equals()를 사용하면 정확히 일치하는 값만 확인
                    // .contains()를 사용하면 찾는 값이 포함되어 있는지 확인
                    if(book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                    break;
                }
            case 2: // 도서명 검색
                for(BookEntity book : books) {
                    if(book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: // 저자명 검색
                for(BookEntity book : books) {
                    if(book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: // 출판사명 검색
                for(BookEntity book : books) {
                    if(book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
        }
        return newArraySize;
    }

    // 다건조회
    public BookEntity[] searchBooks(int option, String searchText) {
        // 새로운 배열을 만들기 위해서는 검색해서 찾은 도서의 사이즈를 먼저 알아야 함.
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];

        // i를 case 안에 넣으면 option을 찾아가는 것이기 때문에, case가 1번이 아닌 경우 skip되어버림.
        int i = 0;

        switch (option) {
            case 1: // 통합 검색
                for(BookEntity book : books) {
                    // .equals()를 사용하면 정확히 일치하는 값만 확인
                    // .contains()를 사용하면 찾는 값이 포함되어 있는지 확인
                    if(book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        // for문의 i와 별개로 봐야 함.
                        // if 조건이 충족 될 때만 i가 증가해야하기 때문.
                        // 그래서 i를 switch 밖에 별도로 초기화 해 놓는 것.
                        searchBooks[i] = book;
                        i++;
                    }
                    break;
                }
            case 2: // 도서명 검색
                for(BookEntity book : books) {
                    if(book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: // 저자명 검색
                for(BookEntity book : books) {
                    if(book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: // 출판사명 검색
                for(BookEntity book : books) {
                    if(book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                // case의 마지막이기 때문에 break가 없음.
        }
        return searchBooks;
    }

}
