/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode reverse(ListNode head1){
        ListNode crr = head1;
        ListNode pre = null;
        ListNode far = null;
        while(crr!=null){
            far = crr.next;
            crr.next = pre;
            pre = crr;
            crr = far;
        }
        return pre;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow.next;
        slow.next = null;
        head1 = reverse(head1);
        ListNode a = head;
        ListNode b = head1;
        while(b!=null){
       ListNode aNext = a.next;
       ListNode bNext = b.next;
       a.next = b;
       b.next = aNext;
       a = aNext;
       b = bNext;
    }
  
    }
}