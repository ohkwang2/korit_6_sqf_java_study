package come.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap();

        strMap.put(10, "김준일");
        strMap.put(11, "김준이");
        strMap.put(12, "김준삼");
        strMap.put(13, "김준사");

        System.out.println(strMap);

        System.out.println(strMap.get(11));

        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang);
        System.out.println(lang.get("java"));

        // Map의 Entry 만들기
        // 중복인 안 되기 때문에 List에는 안 들어감
        // 중복이 들어가도 다 지워버림. 그래서 Set에 들어감
        Set<Map.Entry<String, String>> entries = lang.entrySet();

        for(Map.Entry<String, String> entry : entries) {
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }

        // Map을 set으로 바꾸고, 그 set안에 entry가 들어가도록 한 상태에서 foreach를 돌릴 수 있음.s


    }

}
