package come.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {

    public static void main(String[] args) {

        /*
        System.out.println("[도서 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 도서 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
         */

        Scanner scanner = new Scanner(System.in);
        String[] books = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[도서 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 도서 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택 : ");

            String selectedMenu = scanner.nextLine();
            String[] newBooks = null;
            String inputBookName = null;
            int findBookIndex = -1;
            BookArrayUtils bookArrayUtils = new BookArrayUtils();

            switch (selectedMenu) {
                case "1":
                    System.out.println("도서 등록 메뉴입니다.");
                    newBooks = new String[books.length+1];
                    for(int i = 0; i < books.length; i++) {
                        newBooks[i] = books[i];
                    }
                    books = newBooks;
                    newBooks = null;
                    System.out.println("등록하실 도서명을 입력해주세요.");
                    inputBookName = new String();
                    inputBookName = scanner.nextLine();
                    books[books.length-1] = inputBookName;
                    System.out.println("도서 등록 완료. 등록하신 도서명은 " + "`" + inputBookName + "`" + "입니다.");
                    break;
                case "2":
                    System.out.println("도서 수정 메뉴입니다.");
                    System.out.println("수정하실 도서 이름을 입력해주세요.");
                    inputBookName = new String();
                    inputBookName = scanner.nextLine();
                    findBookIndex = bookArrayUtils.findIndexByName(books, inputBookName);
                    if(findBookIndex == -1) {
                        System.out.println("일치하는 도서명이 없습니다. 다시 검색해주세요.");
                        break;
                    }
                    System.out.println("수정하실 도서의 이름을 입력하세요.");
                    String modifyBookName = scanner.nextLine();
                    books[findBookIndex] = modifyBookName;
                    System.out.println("도서 수정 완료");
                    System.out.println("수정 전 도서 이름: " + inputBookName + ", 수정 후 도서 이름: " + modifyBookName);
                    break;
                case "3":
                    System.out.println("도서 삭제 메뉴입니다.");
                    System.out.println("삭제하실 도서명을 입력해주세요.");
                    inputBookName = new String();
                    inputBookName = scanner.nextLine();
                    boolean isDeleteRun = false;
                    findBookIndex = bookArrayUtils.findIndexByName(books, inputBookName);
                    if(findBookIndex == -1) {
                        System.out.println("존재하지 않는 도서입니다. 다시 검색해주세요.");
                        break;
                    }
                    isDeleteRun = true;
                    while(isDeleteRun) {
                        System.out.println("삭제가 가능한 도서입니다.");
                        System.out.println("삭제하시려면 'Y'를 취소하시려면 'N'을 입력해주세요.");
                        String deleteConfirm = scanner.nextLine();
                        switch (deleteConfirm) {
                            case "Y":
                                newBooks = new String[books.length-1];
                                for(int i = 0; i < newBooks.length; i++) {
                                    if(i < findBookIndex) {
                                        newBooks[i] = books[i];
                                    }
                                    newBooks[i] = books[i+1];
                                }
                                books = newBooks;
                                newBooks = null;
                                System.out.println("해당 도서를 삭제하였습니다.");
                                isDeleteRun = false;
                                break;
                            case "N":
                                System.out.println("취소 하셨습니다.");
                                isDeleteRun = false;
                                break;
                            default:
                                System.out.println("잘못 입력하셨습니다. 삭제 하시겠습니까?");
                                break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("도서 찾기 메뉴입니다.");
                    System.out.println("찾으실 도서 이름을 입력하세요.");
                    inputBookName = new String();
                    inputBookName = scanner.nextLine();
                    findBookIndex = bookArrayUtils.findIndexByName(books, inputBookName);
                    if (findBookIndex == -1) {
                        System.out.println("찾으신 도서는 존재하지 않습니다. 다시 검색해 주세요.");
                        break;
                    }
                    System.out.println("찾으신 도서는 " + (findBookIndex+1) + "번 도서입니다.");
                    break;
                case "5":
                    System.out.println("전체 도서 목록 조회 메뉴입니다.");
                    System.out.println("등록하신 도서의 목록은 아래와 같습니다.");
                    if(books.length == 0) {
                        System.out.println("등록된 도서가 없습니다.");
                    }
                    for(int i = 0; i < books.length; i++) {
                        System.out.println((i+1) + "번 도서 : " + books[i]);
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
                    break;
            }
            System.out.println();
        }
    }
}
