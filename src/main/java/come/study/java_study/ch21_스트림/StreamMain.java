package come.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        // Stream은 반복작업을 통해 데이터 묶음을 조건에 맞게 활용하기 위해 사용.
        /* 생성(사용) 절차
            1. 배열 생성 -> 스트림으로 변환
            2. List 생성 -> 스트림으로 변환
            3. generate 메소드 -> 스트림 생성
            4. 범위 지정 -> 스트림 생성
            5. 빌더 -> 스트림 생성
        */

        /* 중간(가공) 절차
            1. map (Function)
            2. filter (Predicate)
            3. sorted (Comparator)
        */

        /* 최종(결과) 절차
            1. collect -> stream을 list로 변환
            2. 반복자 -> forEach
         */

        // 배열을 Stream으로 변환 (map)
        Stream<Integer> st1 = Arrays.stream(new Integer[] {1,2,3,4,5}); // 1. stream 생성
        System.out.println(st1);
        // peek안에 Consumer (매개변수만 있고 리턴 값 없음)가 들어옴
        // peak는 stream을 실행하는 동안 중간 중간에 결과값을 확인하기 위해 사용
        // map안에 Function (매개변수와 리턴 값) 이 들어옴 (key, value의 Map과 다른 개념)
        // map은 stream의 값을 반복을 돌려 값을 새로운 스트림에 담음.
        List<Integer> numberList = st1
                .map(n -> n * 2) // 2. stream 가공
                .peek(n -> System.out.println(n))   // 2. stream 가공 (중간 출력 및 확인 용도)
                .collect(Collectors.toList());      // 3. stream 결과 (stream을 list에 담음)

        numberList.forEach(n -> System.out.println("n: " + n));

        System.out.println("*****************");

        // List를 Stream으로 변환 (filter)
        List<Integer> filteringNumberList = numberList
                .stream()   // 1. 생성) List를 Stream으로 변환
                .map(n -> n / 2)    // 2. 가공) stream의 값을 2로 너눠서 새로 담기
                .filter(n -> n % 2 == 0)    // 2. 가공) Stream에서 짝수만 찾아서 새로 담기
                .collect(Collectors.toList());  // 3. 결과) 찾은 데이터를 리스트에 담기

        filteringNumberList.forEach(n -> System.out.println("n: " + n));

        System.out.println("*****************");

        // List를 Stream으로 변환 (sorted)
        List<Integer> sortedNumberList = numberList
                .stream()
                .sorted((o1, o2) -> o2 - o1)    // 내림차순 정렬 (오름차순으로 변경하려면 o1, o2자리 바꿔주면 됨. 단, 해당 타입이 Object
                .collect(Collectors.toList());

        sortedNumberList.forEach(n -> System.out.println("n: " + n));

        System.out.println("*****************");

        // builder를 stream으로
        Stream<String> nameStream = Stream
                .<String>builder()
                .add("손경태")
                .add("최단비")
                .add("김지현")
                .add("정령우")
                .add("이성민")
                .build();

//        nameStream
//                .sorted()   // default 오름차순 정렬
//                .forEach(name -> System.out.println(name));
        // stream 객체는 한 번만 호출 가능

        System.out.println("*****************");

        nameStream
                .sorted((o1, o2) -> Objects.hash(o2) - Objects.hash(o1))    // 정렬시 들어가는 값은 object이기 때문에 String 자료일 경우 계산가능하도록 변환 필요
                .forEach(name -> System.out.println(name));

        List<Phone> phoneList = List.of(
                Phone.builder().number(1).model("아이폰").build(),
                Phone.builder().number(2).model("갤럭시").build(),
                Phone.builder().number(3).model("샤오미").build()
        );

        System.out.println("*****************");

//        phoneList.stream().map(phone -> {
//            phone.setNumber(phone.getNumber() * 2); // 새로운 객체를 생성하지 않았기 때문에 주소가 같음.
//            return phone;   // 변환된 값이 return
//        });
        // 위 처럼 사용하지 않음. 주소가 같기 때문에 for문 돌리는게맞음

        // builder
        phoneList.stream()
                .map(phone -> phone.builder()
                    .number(phone.getNumber() * 2)
                    .model(phone.getModel())
                    .build())
                .forEach(phone -> System.out.println(phone));

        System.out.println("*****************");

        // filter
        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)
                .forEach(phone -> System.out.println(phone));

        System.out.println("*****************");

        // sorted (number 기준 역정렬)
        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));

        System.out.println("*****************");

        // sorted (modelName 기준 역정렬)
        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                .forEach(System.out :: println);    // stream안에서 람다식을 요렇게 변형해서도 사용 함.

    }
}
