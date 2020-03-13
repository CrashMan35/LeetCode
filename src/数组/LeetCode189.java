package 数组;

import java.util.Arrays;

public class LeetCode189 {
    public static void rotate(int[] nums, int k) {
        int tmpl=0;
        for (int i = 0; i < k; i++) {
            tmpl = nums[nums.length - 1];
            for (int j = nums.length-2; j >= 0; j--) {
                nums[j + 1] = nums[j];
            }
            nums[0]=tmpl;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
