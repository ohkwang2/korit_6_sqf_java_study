package come.study.java_study.ch06_배열;

public class ArrayMain02 {

    public static void main(String[] args) {
        /*
        배열의 특징
        1. 배열은 동일한 데이터 타입의 요소들을 저장 (int타입 배열은 int 값만 저장)
        2. 배열의 각 요소는 순차적인 인덱스를 가지며, 해당 인덱스를 활용하여 각 요소에 접근 가능
        3. 배열의 공간 크기는 늘리거나 줄일 수 없음. (메모리에 연속적으로 배치하기 때문에 메모리를 동적으로 할당할 수 없음)
        -> 배열의 공간 크기를 늘리려면 추가할 만큼 메모리에 새로 할당해서 동일한 값을 다시 넣어주고, 인덱스에 맞는 값을 넣어주어야 함.
           이전에 할당한 것은 GC가 수거해감.
         */

        // "김준일" => 999
        String a = "김준일";               // 999
        String b = new String("김준일");   // 200 -> 999

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");
        System.out.println(b == "김준일");

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");

        String[] names2 = new String[] {"김준일", new String("김준일")};

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);
        System.out.println(names == names2);

        /*
        int n = 10;

        n = n+1;
        n++;
        n += 1;

        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
        System.out.println({"a", "b"});
         */
    }

}
