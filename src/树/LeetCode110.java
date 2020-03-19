package 树;

public class LeetCode110 {
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leH = height(root.left);
        if (leH == -1) {
            return -1;
        }
        int riH = height(root.right);
        if (riH == -1) {
            return -1;
        }
        if (leH - riH < -1 || leH - riH > 1) {
            return -1;
        }
        return Math.max(leH,riH)+1;
    }

}
