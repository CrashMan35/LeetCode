package 剑指offer;



import java.util.Stack;

public class offer06 {
    public int[] reversePrint(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        int length=0;
        while (node != null) {
            length++;
            stack.add(node.val);
            node = node.next;
        }
        int[] reverse = new int[length];
        int i = 0;
        while (!stack.isEmpty()) {
            reverse[i] = stack.pop();
            i++;
        }
        return reverse;
    }
}
