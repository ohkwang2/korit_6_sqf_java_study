package come.study.java_study.ch04_제어;

import java.util.Scanner;

public class WhilePractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        while (isRun) {
            System.out.println("전화주셔서 감사합니다. thank you for calling me");
            System.out.println("언어를 선택해주세요. choose your language.");
            System.out.println("1. 한국어");
            System.out.println("2. english");
            System.out.println("3. chinse");
            System.out.println("다시 들으시려면 0번을 눌러 주세요.");
            System.out.println();

            String selectedMenu = scanner.nextLine();
            switch (selectedMenu) {
                case "1":
                    System.out.println("한국어로 안내합니다.");
                    boolean isKoreanRun = true;
                    while(isKoreanRun) {
                        System.out.println("문의 하고자 하는 메뉴를 선택해주세요.");
                        System.out.println("1. 비자 문의");
                        System.out.println("2. 한국어 수업 문의");
                        System.out.println("다시 들으시려면 0번을, 이전 메뉴로 돌아가려면 *을 눌러 주세요.");
                        System.out.println();
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("비자 문의를 선택하셨습니다.");
                                break;
                            case "2":
                                System.out.println("한국어 수업 문의를 선택하셨습니다.");
                            case "0":
                                System.out.println("다시 듣기를 선택하셨습니다.");
                                break;
                            case "*":
                                System.out.println("처음 메뉴로 돌아갑니다.");
                                isKoreanRun = false;
                                break;
                            default:
                                System.out.println("잘못 입력하셨습니다.");
                                break;
                        }
                        System.out.println();
                    }
                    break;
                case "2":
                    System.out.println("English guide");
                    break;
                case "3" :
                    System.out.println("Chinse guide");
                    break;
                case "0" :
                    System.out.println("다시 듣기를 선택하셨습니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
            System.out.println();
        }


    }
}
