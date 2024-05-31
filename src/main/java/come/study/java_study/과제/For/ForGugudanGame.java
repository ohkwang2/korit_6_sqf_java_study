package come.study.java_study.과제.For;

import java.util.Random;
import java.util.Scanner;

public class ForGugudanGame {

        int answer = 0;
        int numberofproblems = 0;

        public void gameStart() {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("[구구단 게임]");              //[구구단] 문자열 출력
            for (; ; ) {    //for문을 while문 처럼 만들기
                System.out.println("문제 개수는 1 ~ 10 안에서 선택할수 있습니다.");
                System.out.print("풀 문제 개수를 입력하세여 :");
                numberofproblems = scanner.nextInt();
                scanner.nextLine();

                if(!(0 < numberofproblems && numberofproblems < 11)) {
                    System.out.println("문제도 제대로 읽지 않는 당신 문제풀 자격이 없습니다.");
                    break;    // break가 있을 경우 조건을 만족할 때, 뒤에 나오는 내용을 무시하고 for문 자체를 종료
//                    return; // return을 넣을 경우 반복문뿐만 아니라 현재 실행하는 메소드 자체를 빠져나감
//                    System.out.println("문제 개수를 잘못 입력했습니다.");
//                    System.out.println();
//                    continue;   // continue가 있을 경우 조건을 만족할 때, if문 내 명령 실행 후 뒤에 나오는 내용을 무시하고 다음 반복으로 넘어감
                    // 아무것도 없을 경우 해당 조건을 만족할 때, 해당 내용 실행 뒤 뒤에 나오는 명령문 실행

                }
                System.out.println();
                System.out.println("[구구단 게임 시작]");

                int randomnum;
                int randomdan;
                for (int i = 0; i < numberofproblems; i++) {
                    // 구구단을 새롭게 생성하기
                    randomnum = random.nextInt(9) + 1;        //랜덤 0~9 숫자에서 1을 더한 값 을 randomnum 담는다
                    randomdan = random.nextInt(9) + 1;        //랜덤 0~9 숫자에서 1을 더한 값 을 randomdan 담는다
                    System.out.println(randomdan + " X " + randomnum + "= ");
                    // 정답 입력
                    System.out.print("정답을 입력하세요 : ");

                    int result = scanner.nextInt();
                    scanner.nextLine();

                    //구구단 결과값이 false일 경우 실행
                    if (!(randomdan * randomnum == result)) {
                        System.out.println("틀렸습니다. 당신은 문제풀 자격이 없습니다.");
                        return; // 메소드 전체를 나감
//                        System.out.println("틀렸네요. 안타깝습니다. 여기서 게임을 종료합니다.");
//                        break;    // break가 있을 경우 조건을 만족할 때, 뒤에 나오는 내용을 무시하고 for문 자체를 종료
//                        System.out.println("틀렸습니다.");
//                        continue;   // continue가 있을 경우 조건을 만족할 때, 뒤에 나오는 내용을 무시하고 다음 반복으로 넘어감
//                        아무것도 없을 경우 해당 조건을 만족할 때, 해당 내용 실행 뒤 뒤에 나오는 명령문 실행
                    }
                    System.out.println("정답 입니다");
                    answer++;   //정답 수 counting
//                    break;  // 다음 반복으로 넘어가지 않고 for문의 반복을 즉시 종료
//                    아무것도 입력하지 않을 경우 for문 계속해서 실행
//                    continue;   // 반복을 계속 실행하는 것으로 아무것도 입력하지 않은 상황과 동일
                }
                System.out.println();
                System.out.println("정답 맞춘 수 : " + answer);
                break;  //전체 for문 종료
        }
    }
}

