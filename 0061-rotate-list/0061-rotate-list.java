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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        ListNode p = head;
        int count =0;
        while(p.next!=null){
            p=p.next;
            count++;
        }
        p.next = head;
         k = k % (count + 1); 
        k = count - k;
        for(int i=0;i<=k;i++){
            p = p.next;
        }
        head  = p.next;
        p.next = null;
        return head;

        
    }
}