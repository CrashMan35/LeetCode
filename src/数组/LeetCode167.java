package 数组;

import java.util.*;

public class LeetCode167 {
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {

            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int rest=target-numbers[i];
            if (map.containsKey(rest)) {
                return new int[]{i + 1, map.get(rest)+1};
            }

        }
        return null;
    }

    public static int[] twoSum2(int[] numbers, int target) {
        int front = 0;
        int back = numbers.length-1;
        while (front < back) {
            int sum=numbers[front]+numbers[back];
            if (sum == target) {
                return new int[]{front + 1, back + 1};
            } else if (sum < target) {
                front++;
            } else {
                back--;
            }
        }
        return null;

    }


    public static void main(String[] args) {
        int[] numbers = new int[]{-1, 0};
        int[] newNumbers = twoSum(numbers, -1);
        System.out.println(Arrays.toString(newNumbers));

    }
}
