package come.study.java_study.과제.IF문;

import java.util.Random;
import java.util.Scanner;

public class ForeachGugudanGame {

    int answer;
    int numberofproblems;

    public void gameStart() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("[구구단 게임]"); //[구구단] 문자열 출력

        for (; ; ) {
            System.out.println("문제 개수는 1 ~ 10 안에서 선택할수 있습니다.");
            System.out.print("풀 문제 개수를 입력하세여 :");
            numberofproblems = scanner.nextInt();
            scanner.nextLine();

            if (!(0 < numberofproblems && numberofproblems < 11)) {
                System.out.println("문제 개수를 잘못 입력했습니다.");
                System.out.println();
                continue;
            }

            // foreach를 사용하여 값을 생성하기 풀 문제 개수만큼 비어있는 int 배열을 생성
            int[] numberofproblemsarrays = new int[numberofproblems];

            // int 배열에 비어있는 값을 채우고, 구구단을 실행하는 반복
            for (int numberofproblemsarray : numberofproblemsarrays) {
                int randomdan = random.nextInt(9) + 1;
                int randomnum = random.nextInt(9) + 1;

                numberofproblemsarray = (randomdan * randomnum);
                System.out.println(randomdan + " X " + randomnum + "= ");

                System.out.print("정답을 입력하세요 : ");
                int result = scanner.nextInt();
                scanner.nextLine();

                if (!(numberofproblemsarray == result)) {
                    System.out.println("틀렸습니다");
                    continue;
                }
                System.out.println("정답 입니다");
                answer++;
            }

            System.out.println();
            System.out.println("정답 맞춘 수 : " + answer);
            break;
        }
    }
}

