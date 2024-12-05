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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode p = head;
        ListNode q = head.next;
        ListNode r = q;
        while(r!=null && r.next!=null){
            p.next = p.next.next;
            p = p.next;
            r.next = r.next.next;
            r = r.next;

        }
        p.next = q;
        return head;
        
    }
}