package 数组;

public class LeetCode35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <target) {
                index = i+1;
            } else if (nums[i] >= target) {
                index=i;
                break;
            }

        }
        return index;
    }

    public int searchInsert2(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left=0,right=nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right=mid-1;
            }
        }
        return left;

    }
}
