package 位运算;

import java.util.Scanner;

public class LeetCode136 {
    public int singleNumber(int[] nums) {
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
