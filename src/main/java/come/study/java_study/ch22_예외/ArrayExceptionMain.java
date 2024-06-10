package come.study.java_study.ch22_예외;

/*
    예외 (오류)
    1. 컴파일 오류 -> 프로그램이 실행(메모리에 할당) 되기 전에 오류 발생
        - 문법적 오류 有
        - 메모리 부족
    2. 런타임 오류 -> 프로그램이 실행(메모리에 할당)된 후 오류 발생
        - StackOverFlow

 */
public class ArrayExceptionMain {

    public static void printArray(Integer[] nums, int length) throws Exception {
        for(int i = 0; i < length; i++) {
            System.out.println("i: " + nums[i]);
        }
    }

    // 메인 이전은 JVM
    // 고로 main에서 throws를 할 경우 JVM에서 예외 처리.
    // So, main은 최종 메소드이므로 여기서는 더 이상 예외를 미루면 안 됨.
    public static void main(String[] args){
        Integer[] nums = new Integer[] {1,2,3,4,5};

        // 예외가 일어날 것 같은 곳을 try로 넣어놓고, 예외 발생시 catch에서 받을 수 있도록 설정
        try {
            printArray(nums, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}