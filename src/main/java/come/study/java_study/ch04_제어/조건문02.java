package come.study.java_study.ch04_제어;

public class 조건문02 {

    public static void main(String[] args) {
        String text = new String("");
        String name = "";       // 값의 자료형 String
        String phone = "";    // 값의 자료형 null

//        System.out.println(text.length());
//        System.out.println(name.length());
//        System.out.println(phone.length());   //pnone 값이 null이므로 오류 발생

        StringUtils stringUtils = new StringUtils();

        // 함수의 return 자료형이 void일 때 만 사용 가능.
        // 함수의 끝을 의미하므로 "name이 비어있습니다." 출력 후 함수를 나가버림.
        // 웬만하면 esle if 쓰지 말 것. (가독성면에서도 좋고, 성능면에서도 좋음. '아니면'이라는 조건이 없기 때문에 조건이 하나 덜 들어감)
        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text가 비어있습니다.");
            return;
        }

        System.out.println("...........");

        // ★'=' : 주소값 비교를 의미, 해당 변수의 값이 리터럴 상수인 경우 값 자체를 비교★
        // (리터럴 상수는 주소가 동일하기 때문에 결국 값 비교가 주소값 비교가 됨)
        if(name == null || name == "") {
            System.out.println("name이 비어있습니다.");
        }

        if(name == null || name.equals("")) {
            System.out.println("name이 비어있습니다.");
        }

        if(phone == null || phone == "") {
            System.out.println("phone이 비어있습니다.");
        }

        //phone에는 null이 들어있기 때문에 원칙적으로 '.equals'를 쓰면 안 됨.
        if(phone == null || phone.equals("")) {
            System.out.println("phone이 비어있습니다.");
        }

        // new를 통해 새로 주소를 부여할 경우 주소값을 비교하기 때문에 다르다고 판단함.
        if(text == null || text == "") {
            System.out.println("text가 비어있습니다.");
        }

        if(text == null || text.equals("")) {
            System.out.println("text가 비어있습니다.");
        }

        System.out.println("...........");

    }

}
