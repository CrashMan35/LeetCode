package 动态规划;

public class LeetCode198 {
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int odd = 0, even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even += nums[i];
                even=Math.max(even,odd);
            } else {
                odd += nums[i];
                odd=Math.max(even,odd);
            }
        }
        return Math.max(even, odd);
    }

    public static int rob1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        dp[0]=0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i-1], dp[i - 1]);
        }
        return dp[nums.length];
    }

    public static int rob2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int prev1=0,prev2=0;
        for (int num : nums) {
            int temp=prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = temp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 2};
        System.out.println(rob(nums));

    }
}
