package come.study.java_study.ch20_람다;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface LambdaInterface2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("프로그램을 시작합니다.");
            }
        };

        Runnable run2 = () -> System.out.println("프로그램을 시작합니다.");
        Runnable run3 = () -> {
            System.out.println("프로그램을 시작합니다.");
        };

        Supplier<Integer> sp1 = new Supplier() {
            @Override
            public Integer get() {
                return 100;
            }
        };

        Supplier<Integer> sp2 = () -> 100;

        Consumer<String> cs1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                Integer.parseInt(s);
            }
        };

        Consumer<String> cs2 = s -> Integer.parseInt(s);

        Function<String, Integer> fx1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Function<String, Integer> fx2 = s -> Integer.parseInt(s);

        Predicate<String> pd = s -> s == "김준일";
        System.out.println(pd.test("김준삼"));

        Integer fx3 = fx2.andThen(result -> result + 5).apply(scanner.nextLine());
        System.out.println(fx3);
    }
}
