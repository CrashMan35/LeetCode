package 树;

import java.util.Stack;

public class LeetCode104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depth = new Stack<>();
        stack.push(root);
        depth.push(1);
        int max = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int curdepth = depth.pop();
            max = Math.max(curdepth, max);
            if (node.right != null) {
                stack.push(node.right);
                depth.push(curdepth + 1);
            }
            if (node.left != null) {
                stack.push(node.left);
                depth.push(curdepth + 1);
            }
        }
        return max;
    }

}
