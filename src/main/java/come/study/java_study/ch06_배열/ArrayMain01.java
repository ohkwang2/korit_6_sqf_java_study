package come.study.java_study.ch06_배열;

public class ArrayMain01 {

    public static void main(String[] args) {
        int[] nums = new int[100];

//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[1] == nums[2]);
//        nums[1] = 20;
//        nums[2] = 20;
//        System.out.println(nums[1] == nums[2]);   //안에 들어 있는 값을 비교 하는 것.

//        System.out.println(nums);
//        System.out.println(nums.length);
//        System.out.println(nums[0]);
//        System.out.println(nums[1]);
//        System.out.println(nums[2]);
//        System.out.println(nums[3]);

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }

        // foreach와 동일/ 단, 인덱스가 없음. (처음부터 끝까지 반복)
        for(int num : nums) {
            System.out.println(num);
        }

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }

    }

}
