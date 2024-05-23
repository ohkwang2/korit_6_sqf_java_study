package come.study.java_study.ch04_제어;

public class 조건문01 {

    public static void main(String[] args) {
        // 1. if, else if, else (단, 삼항 연산자로 해결될 경우 가능한한 삼항연산자를 쓰는 것이 좋음)
        // 2. switch, case, default
        // 3. continue, break

//        if(false) {
//            System.out.println("참입니다.");
//        } else {
//            System.out.println("거짓입니다.");
//        }

        int num = 10;

        if(num % 2 == 0 && num % 10 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        // 명령이 1개이면 {}를 안 해도 됨.
        // 이를 활용해서 else if가 만들어짐.
        if(num % 2 == 0) System.out.println("2의 배수입니다.");

        //{}없이 2개의 명령을 입력할 경우 2번은 독립된 형태로 간주함.
        if(num % 2 == 0)
            System.out.println("2의 배수입니다.");
            System.out.println("2의 배수입니다.");

        if(num % 2 == 0) {
            System.out.println("2의 배수입니다.");
        } else {
            if(num % 3 == 0) {
                System.out.println("3의 배수입니다.");
            } else {
                System.out.println("2의 배수도 아니고 3의 배수도 아닙니다.");
            }
        }

        if(num % 2 == 0) {
            System.out.println("2의 배수입니다.");
        } else if(num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("2의 배수도 아니고 3의 배수도 아닙니다.");
        }

        if(num % 2 == 0) {
            System.out.println("2의 배수입니다.");
        } else if(num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if(num % 7 == 0) {
            System.out.println("7의 배수입니다");
        } else {
            System.out.println("2의 배수도 아니고 3의 배수도 아니고 7의 배수도 아닙니다.");
        }

    }
}
