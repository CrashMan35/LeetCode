package 数组;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode88 {
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1=m;
        int len2=n;
        int sumLen=m+n;
        while (len1 > 0 && len2 > 0) {
            if (nums1[len1 - 1] >= nums2[len2 - 1]) {
                nums1[sumLen - 1] = nums1[len1 - 1];
                len1--;
            } else {
                nums1[sumLen - 1] = nums2[len2 - 1];
                len2--;
            }
            sumLen--;
        }
        if (len1 == 0) {
            for (int i = 0; i < len2; i++) {
                 nums1[i]=nums2[i];
            }
        }

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));

    }
}
