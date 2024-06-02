package come.study.java_study.ch09_클래스04;

import java.util.Arrays;
import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository boookRepository;

    public BookService() {
        //BookService가 실행 될 때만 새로 생성
        scanner = new Scanner(System.in);
        boookRepository = new BookRepository();
    }

    /*도서 메뉴 선택 기능 _ 2024.05.28*/
    private String selectMenu() {
        //원래 배열을 입력해야 함. = 12도 인식 되기 때문
        String[] menus = {"1", "2", "3", "4", "q"};
        String selectedMenu = null;

        boolean confirmMenu = true;
        while(confirmMenu) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();

            // binarySearch : 이진탐색 (트리구조 탐색), 이진수 값 반환
//            if(Arrays.binarySearch(menus, selectedMenu) > -1) {
//                break;
//            }

            // 이진탐색을 하지 않을 경우 아래처럼
            for(String menu : menus) {
                if(menu.equals(selectedMenu)) {
                    return selectedMenu;
                }
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu;
    }

    /*도서 관리 시스템 실행 기능 _ 2024.05.28*/
    public boolean run() {
        boolean isRun = true;   //main의 반복을 제어하기 위한 기능. 조건 선택되면 멈추도록 (false 되면 main이 멈추고 프로그램 종료 실행)

        System.out.println("[ 도서 관리 프로그램 ]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();
        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook();
                break;
            case "2":
                search();
                break;
            case "3":
                modify();
                break;
            case "4":
                remove();
                break;
            default:
                System.out.println("입력오류!");
        }
        System.out.println();

        return isRun;
    }

    /*도서 유효성 검사 기능 _ 2024.05.28*/
    private String validateValue(String title) {
        String value = null;
        while(true) {
            System.out.print(title + "명 입력: ");
            value = scanner.nextLine();
            // .isBlank()는 " "와 비어있는 것 모두 포괄하여 값이 비어 있는지 확인
            // .isEmpty()는 " "를 제외하고 값이 비어 있는지만 확인
            if(!value.isBlank()) {
                break;
            }
                System.out.println(title+ "명은 공백일 수 없습니다. 다시 입력하세요.");
        }
        return value;
    }

    /*도서 중복 확인 기능 _ 2024.05.28*/
    private String duplicateBookName() {
        String bookName = null;
        while(true) {
            bookName = validateValue("도서");
            if(boookRepository.findBookByName(bookName) == null) {
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시 입력하세요.");
            break;
        }
        return bookName;
    }

    /*도서 등록 기능 _ 2024.05.28*/
    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        // 도서 객체 1개를 만들기 위해 필요한 정보 입력
        int bookId = boookRepository.autoIncrementBookId();
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        // 입력한 정보를 기반으로 도서 객체 1개 생성
        BookEntity book = new BookEntity(bookId, bookName, author, publisher);

        // 도서 등록 (기존 도서 배열에 추가)
        boookRepository.saveBook(book);
        System.out.println("새로운 도서를 등록하였습니다.");
    }

    /*도서 검색 기능 _ 2024.05.28*/
    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합 검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");

        // 검색 옵션 입력
        System.out.print("옵션 선택: ");
        int option = scanner.nextInt(); // int 이외의 값이 안 들어가도록 예외처리를 해주어야 함.
        scanner.nextLine(); // int 값의 마지막 'enter' buffer 비워주기 위함

        // 검색어 입력
        System.out.print("검색어 입력: ");
        String searchText = scanner.nextLine();

        // 입력한 검색 옵션과 검색어를 기반으로 일치하는 객체 주소 저장
        BookEntity[] searchBooks = boookRepository.searchBooks(option, searchText);

        // 해당 객체 주소로 가서 결과값 출력
        System.out.println(" [검색 결과] ");
        if(searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            System.out.println();
            return; // 함수를 강제로 빠져나갈 때 return을 사용. (break는 while이나 switch문을 빠져나갈 때 사용)
        }
        for(BookEntity book : searchBooks) {
            System.out.println(book.toString());
        }
    }

    /*도서 삭제 기능 _ 2024.05.29*/
    private void remove() {
        System.out.println("[ 도서 삭제 ]");

        // ID값을 불러오기 위해 기존에 만들었던 조회 기능 재활용
        search();

        // 삭제할 ID값 입력
        System.out.print("삭제할 도서 번호 입력: ");
        int removeBookId = scanner.nextInt();
        scanner.nextLine();

        // 입력한 ID값에 해당하는 도서 객체가 도서 배열에 있는지 확인
        BookEntity book = boookRepository.findBookByBookId(removeBookId);
        if(book == null) {
            System.out.println("해당 도서 번호는 존재하지 않습니다.");
            return;
        }

        // 도서 삭제 (신규 배열 생성 후 해당 ID값 제외하고 객체 추가)
        boookRepository.deleteBookByBookId(removeBookId);
        System.out.println("도서 삭제가 완료 되었습니다.");
    }

    /*도서 수정 기능 _ 2024.05.29*/
    private void modify() {
        System.out.println(" [도서 수정] ");

        // ID값을 불러오기 위해 기존에 만들었던 조회 기능 재활용
        search();

        // 수정할 ID값 입력
        System.out.println("수정할 도서 번호 입력: ");
        int modifyBookId = scanner.nextInt();
        scanner.nextInt();
        scanner.nextLine();

        // 입력한 ID값에 해당하는 도서 객체가 도서 배열에 있는지 확인
        BookEntity book = boookRepository.findBookByBookId(modifyBookId);
        if(book == null) {
            System.out.println("해당 도서 번호는 존재하지 않습니다.");
            return;
        }

        // 도서 수정 (기존 도서 배열에서 각각의 요소를 선택하여 수정할 수 있도록 switch문 활용하여 내용 수정)
        System.out.println("<< 도서 수정 정보 입력>>");
        for(int i = 0; i < 3; i++) {
            String selected = null;
            switch (i) {
                case 0:
                    System.out.print("도서명을 수정 하시겠습니까?(Y/N)");
                    selected = scanner.nextLine();
                    // .equalsIgnoreCase <- 값의 대소문자를 구분 없이 비교
                    if(selected.equalsIgnoreCase(selected)) {
                        String bookName = duplicateBookName();
                        book.setBookName(bookName);
                        break;
                    }
                    break;
                case 1:
                    System.out.print("저자명을 수정 하시겠습니까?(Y/N)");
                    selected = scanner.nextLine();
                    // .equalsIgnoreCase <- 값의 대소문자를 구분 없이 비교
                    if(selected.equalsIgnoreCase(selected)) {
                        String author = validateValue("저자");
                        book.setAuthor(author);
                        break;
                    }
                    break;
                case 2:
                    System.out.print("출판사명을 수정 하시겠습니까?(Y/N)");
                    selected = scanner.nextLine();
                    // .equalsIgnoreCase <- 값의 대소문자를 구분 없이 비교
                    if(selected.equalsIgnoreCase(selected)) {
                        String publisher = validateValue("출판사");
                        book.setPublisher(publisher);
                        break;
                    }
                    break;
            }
        }
        System.out.println("도서 수정이 완료 되었습니다.");
    }
}
