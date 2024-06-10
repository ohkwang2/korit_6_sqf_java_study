package come.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        runnable.run();

        Function<String, Integer> fx1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                //Integet.parseInt(s) <- String 타입 변수로 들어온 데이터를 Integer로 변환
                return Integer.parseInt(s);
            }
        };

        // 위 메소드를 람다식으로 바꿀 경우
        Function<String, Integer> fx2 = (String s) -> {
                return Integer.parseInt(s);
        };

        // 위 메소드를 조금 더 줄일 경우
        Function<String, Integer> fx3 = (String s) -> Integer.parseInt(s);

        // 위 메소드에서 매개변수가 한 개인 경우
        Function<String, Integer> fx4 = s -> Integer.parseInt(s);


        Integer num = fx1.apply("10");
        System.out.println("num: " + num);

        // fx1의 apply가 실행된 이후에 andthen 안의 result에 apply 실행값이 매개변수로 들어오고, 뒤에 함수가 실행
        Integer num2 = fx1.andThen(result -> result + 100).apply("10");
        System.out.println("num2: " + num2);

        Consumer<String> transform = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "님 환영합니다.");
            }
        };

        Consumer<String> transform2 = s -> System.out.println(s + "님 환영합니다.");

        Consumer<String> transform3 = s -> {
            System.out.println(s + "서버에 접속하였음.");
            System.out.println(s + "님 환영합니다.");
        };

        transform.accept("김준일");
        transform2.accept("김준일");
        transform3.accept("김준일");

        Supplier<Integer> role = () -> {
            Integer result = num + 999;
            return result;
        };

        System.out.println(role.get());

        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10));

    }
}
