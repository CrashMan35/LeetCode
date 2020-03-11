package 链表;

public class LeetCode203 {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null||head.next==null) {
            return null;
        }
        ListNode pre=head;
        ListNode cur = head.next;

        while (cur != null) {
            if (cur.val == val) {
                pre.next=cur.next;
                cur = cur.next;
            } else {
                pre=cur;
                cur=cur.next;
            }
        }
        if (head.val == val) {
            return head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode newHead=removeElements(head,2);
        System.out.println(newHead);
    }
}
