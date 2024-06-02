package come.study.java_study.ch09_클래스04;

import java.awt.print.Book;
import java.util.Arrays;

// 저장소 -> CRUD
public class BookRepository {

    private int bookId;
    private BookEntity[] books;

    /* 도서 CRUD 기본 생성자 _ 2024.05.28*/
    // BookRepository가 생성됨과 동시에 기본 정보를 넣어놓기 위함.
    public BookRepository() {
        books = new BookEntity[0];
    }

    /* 도서 Id 자동 생성 기능 _ 2024.05.28*/
    public int autoIncrementBookId() {
        // 실행되면 자동으로 bookId를 1씩 늘리기 위함
        return ++bookId;
    }

    /* 도서 배열 확장 기능 _ 2024.05.28*/
    // 기능으로 따지자면 배열을 늘리는 기능 (해당 클래스 내에서만 쓰기 때문에 private으로 생성
    private void extendBooks() {
//        // 기본 배열보다 크기가 하나 더 큰 배열을 생성
//        BookEntity[] newBooks = new BookEntity[books.length + 1];
//
//        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈 값이다.
//        for(int i = 0; i < books.length; i++) {
//            newBooks[i] = books[i];
//        }
//
//        // 기존의 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입.
//        books = newBooks;
//        newBooks = null;

        // 기존의 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입.
        books = Arrays.copyOf(books, books.length + 1);

    }

    /* 도서 배열 마지막 인덱스 가져오기 기능 _ 2024.05.28*/
    // 마지막 인덱스를 가져오는 함수
    private int getLastIndex() {
        return books.length - 1;
    }

    /* 확장된 배열의 마지막 인덱스에 새로운 객체 대입 기능 _ 2024.05.28*/
    // 기능으로 따지면 새로운 배열에 객체 대입
    public void saveBook(BookEntity book) {
        // 배열 확장
        extendBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;
    }

    /* bookId 기반 단건 조회 기능 _ 2024.05.28*/
    // 단건 조회 (중복이 허용 될 경우 가장 처음 찾은 데이터 1개만 return)
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

    /* bookName 기반 단건 조회 기능 _ 2024.05.28*/
    // 단건 조회 (중복이 허용 될 경우 가장 처음 찾은 데이터 1개만 return)
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

    /* 조회할 데이터의 객체 배열 공간의 필요한 사이즈를 찾아 반환하는 기능 _ 2024.05.28*/
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
                }
                break;
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

    /* 입력된 데이터를 검색조건에 해당하는 배열 size에 맞게 배열을 생성하고 객체를 넣어 준 상태로 값을 반환하는 기능 _ 2024.05.28*/
    public BookEntity[] searchBooks(int option, String searchText) {
        // 새로운 배열을 만들기 위해서는 검색해서 찾은 도서의 사이즈를 먼저 알아야 함.
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];

        // switch문이 실행되면 입력된 option을 찾아가는 것이기 때문에 i를 case 안에 넣으면 case가 1번이 아닌 경우 skip되어버림.
        int i = 0;

        // 배열 개수를 알기 위한 기능에 똑같이 if 조건이 들어 있지만 다시 들어가 있는 이유는
        // 실제로 입력할 때 들고오는 books는 전체 리스트이기 때문에 다시 조건을 확인해서 넣어주어야 함.
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
                }
                break;
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

    /*  삭제할 도서의 index 찾기 기능 _ 2024.05.29*/
    private int indexOfBookId(int bookId) {
        // 삭제를 위한 도서의 index 찾기
        int findIndex = -1;

        for(int i = 0; i < books.length; i++) {
            if(books[i].getBookId() == bookId) {
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }

    /*  index 기반으로 도서를 삭제 하는 기능 _ 2024.05.29*/
    public void deleteBookByBookId(int bookId) {
        int findIndex = indexOfBookId(bookId);

        // 삭제하고 새로 담을 배열 생성
        BookEntity[] newBooks = new BookEntity[books.length - 1];

        // index 기준으로 새로운 배열에 기존 객체 대체
        for(int i = 0; i < newBooks.length; i++) {
            if(i < findIndex) {
                newBooks[i] = books[i];
                continue;
            }
            newBooks[i] = books[i + 1];
        }
        books = newBooks;
    }
}
