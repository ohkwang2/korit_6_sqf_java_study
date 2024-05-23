package come.study.java_study.ch04_제어;

public class StringUtils {

    //일반적으로 자료형이 boolean인 경우 메소드명을 is??? 또는 has???로 설정
    // null을 항상 먼저 체크해야함. '.equals'는 null인 경우 사용할 수 없기 때문
    boolean isEmpty(String str) {
        //최대한 else를 뺄 수 있는 방안으로 코드를 짤 것.
        if(str == null) {
            return true;
        }
        return str.equals("");

//        return str == null || str.equals("");
    }

}
