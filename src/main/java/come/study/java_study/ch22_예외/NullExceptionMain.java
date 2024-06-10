package come.study.java_study.ch22_예외;

import java.util.ArrayList;
import java.util.List;

public class NullExceptionMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("신선애");
        names.add("김동인");
        names.add("백승주");
        names.add(null);

        // null.할 경우 null은 주소가 없어서 오류 발생
        try {
//            names.forEach(name -> System.out.println(name.toString()));
            for(int i = 0; i < 5; i++) {
                System.out.println(names.get(i).toString());
            }
            System.out.println("트라이 마지막 부분");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {     // 마지막에는 항상 Exception 예외처리를 해주어야 함. (런타임 상위가 Exception이라서 upcasting 되어져서 예외처리 가능)
            e.printStackTrace();
        } catch (Throwable e) {     // Exception에서도 예외처리가 안 되면 Throwable 예외 처리
            e.printStackTrace();
        } finally {                 // finally는 예외건 아니건 무조건 실행
            System.out.println("예외이든 아니든 실행");
        }

        System.out.println("프로그램 종료");
    }

}
