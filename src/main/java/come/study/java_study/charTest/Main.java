package come.study.java_study.charTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HangulSearcher searcher = new HangulSearcher();
        TestClass test = new TestClass("멍청이", "바보");
        Scanner scanner = new Scanner(System.in);

        System.out.print("초성 입력 : ");
        char cho = scanner.next().charAt(0);
        System.out.print("중성 입력 : ");
        char jung = scanner.next().charAt(0);
        System.out.print("종성 입력 : ");
        char jong = scanner.next().charAt(0);
        if (searcher.searchByChosung(test, cho) && searcher.searchByChosung(test, jung) && searcher.searchByChosung(test, jong)) {
        System.out.println("일치하는 단어가 존재 합니다.");
        }
        System.out.println("일치하는 단어가 존재하지 않습니다.");
//        System.out.println("Search by 초성: " + searcher.searchByChosung(test, 'ㅊ'));
//        System.out.println("Search by 중성: " + searcher.searchByJungsung(test, 'ㅗ'));
//        System.out.println("Search by 종성: " + searcher.searchByJongsung(test, 'ㄱ'));
    }
}