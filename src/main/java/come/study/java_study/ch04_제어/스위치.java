package come.study.java_study.ch04_제어;

public class 스위치 {

    public static void main(String[] args) {
        String grade = "A";

        // switch는 해당하는 변수를 찾아가서 거기서부터 끝까지 실행
        // switch case는 보통 단계가 있는 경우 사용
        // 특정 결과값에 부합하는 작업을 할 경우
        switch(grade) {
            case "A":
                System.out.println("A등급");
                break;
            case "B":
                System.out.println("B등급");
                break;
            case "C":
                System.out.println("C등급");
                break;
            case "D":
                System.out.println("D등급");
                break;
            default:
                System.out.println("F등급");
        }
    }
}
