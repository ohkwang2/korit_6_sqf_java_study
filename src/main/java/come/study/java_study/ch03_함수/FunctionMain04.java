package come.study.java_study.ch03_함수;

public class FunctionMain04 {

    public static void main(String[] args) {

        Function04 function04 = new Function04();

        function04.add(10, 20);
        int result = function04.add(20, 30, 40);
        System.out.println(result);

    }
}
