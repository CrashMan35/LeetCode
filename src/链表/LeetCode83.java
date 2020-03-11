package 链表;

public class LeetCode83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur=head.next;
        while (cur != null) {
            if (pre.val == cur.val) {
                cur = cur.next;
                pre.next = cur;
            } else {
                pre=cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
