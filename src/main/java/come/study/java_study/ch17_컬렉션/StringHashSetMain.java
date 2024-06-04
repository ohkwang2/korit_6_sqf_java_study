package come.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();

        // 추가
        strSet.add("김준일");
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");

        System.out.println(strSet);

        // HashSet은 인덱스가 없음. 그래서 .get으로 인덱스를 받아올 수 없음
        for(String name : strSet) {
            System.out.println(Objects.hash(name));
        }

        strSet.addAll(List.of("김준일", "김준일", "김준이"));

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet); // ★ 중복 제거된 arrayList 생성

        //아래의 람다식과 동일한 구조
//        Comparator<String> stringComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
//            }
//        };

        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2));
        System.out.println(strList);


    }
}
