package 数组;

public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int curSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i], nums[i] + curSum);
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}

