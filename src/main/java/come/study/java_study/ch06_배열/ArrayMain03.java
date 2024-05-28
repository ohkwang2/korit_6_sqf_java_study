package come.study.java_study.ch06_배열;

public class ArrayMain03 {

    public static void main(String[] args) {
        int[] nums = new int[] {10, 20, 30, 40, 50, 60};

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int num6 = 60;

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        nums[5] = 60;

        String[] strArrays = new String[5];
        strArrays[0] = "";

        strArrays[0] = new String("가");
        strArrays[1] = "나";
        strArrays[2] = "다";
        strArrays[3] = "라";
        strArrays[4] = "마";

        for(int num : nums) {
            System.out.println(num);
        }

        for(String str : strArrays) {
            System.out.println(str);
        }

        double[] doubles = new double[3];
        doubles[0] = 10.5;
        doubles[1] = 20.5;
        doubles[2] = 30.5;

        for(double dNum : doubles) {
            System.out.println(dNum);
        }

        Computer[] computers = new Computer[3];
        computers[0] = new Computer("i3", "8GB");
        computers[1] = new Computer("i5", "16GB");
        computers[2] = new Computer("i7", "32GB");

        for(Computer computer : computers) {
            System.out.println(computer.toString());
        }

    }

}
