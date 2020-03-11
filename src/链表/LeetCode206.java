package 链表;

public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre=null;
        ListNode cur=head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;

    }
}
