package 数组;

public class LeetCode27 {
    private static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }

        }
        return index;
    }



    public static void main(String[] args) {
        int[] test1 = {3, 2, 2, 3};
        int newLength=removeElement(test1,3);
        System.out.println(newLength);
    }
}
