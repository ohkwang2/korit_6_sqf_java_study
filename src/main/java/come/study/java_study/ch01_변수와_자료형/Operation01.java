package come.study.java_study.ch01_변수와_자료형;

public class Operation01 {

    public static void main(String[] args) {
        // ☆연산자☆

        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2);
        int num3 = 9 % 2;
        System.out.println(num3);
//        int num4 = ? % 2;
        boolean num4 = 5 % 2 == 0;

        /*long-int, float-double은 연산시 최종 큰 범위에 해당하는 변수로 저장
        long a = 10l;
        int b = 10;
        long c = a+b;
        System.out.println(a+b);
        */

        System.out.println("///////////////////////");

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++; //후 증가
        System.out.println(i);
        i = i +1;
        System.out.println(i);
        ++i; //선 증가
        System.out.println(i);
        System.out.println(++i); //선 증가
        System.out.println(i++); //후 증가
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--);

        // 논리 연산자
        // true => 1 (연산 결과가 0이 아니면 true)
        // false => 0 (연산 결과가 0이면 false)
        // && => AND (곱)
        // || => OR (합)
        // ! => NOT (부정)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(!true);
        System.out.println(!(true && true));

        System.out.println("////////////////////");

        // 관계 연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 == 1);
        System.out.println(1 != 1);

        System.out.println("/////////////////////");

        // 조건 연산자
        /*삼항 연산자의 값에 해당하는 두 항은 자료형을 일치시켜주어야 함! (결과값이 들어가는 변수가 결국 정해져 있기 때문)*/
        System.out.println(3 > 1 ? "참" : "거짓"); //삼항 연산자 조건 ? "?"(조건이 참일 경우 결과값) : "?"(조건이 거짓일 경우 결과값)
        System.out.println(3 > 2 ? 10 : 20);
        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다.";
        String result2 = "" + 10 / 2;

        System.out.println(result);
        System.out.println(result2);

        System.out.println("/////////////////////");

        // 복합대입연산자 (선순위, 후 순위 개념이 아님)
        int number = 10;
        number += 5; //자기 자신한테 5를 더해서 다시 넣어
        number -= 1;
        number *= 2;
        number /= 2;
        number %= 2;

        System.out.println("/////////////////////");
        int o = 10;
        System.out.println(o);
        o += 1;
        System.out.println(o);
        o =- o;
        System.out.println(o);
    }
}
