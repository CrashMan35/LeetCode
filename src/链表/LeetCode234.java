package 链表;

import java.util.ArrayList;
import java.util.List;

public class LeetCode234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode reverseP=reverseList(firstHalfEnd.next);
        ListNode p1=head;
        ListNode p2=reverseP;
        boolean result=true;
        while (result && p2 != null) {
            if (p1.val != p2.val) result = false;
            p1 = p1.next;
            p2 = p2.next;
        }


        return result;
    }
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    private ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindrome2(ListNode head) {
        List<Integer> arrayOfList = new ArrayList<>();
        ListNode cur=head;
        while (cur != null) {
            arrayOfList.add(cur.val);
            cur=cur.next;
        }

        int front=0;
        int back = arrayOfList.size() - 1;
        while (front < back) {
            if (!arrayOfList.get(front).equals(arrayOfList.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;

    }


}
