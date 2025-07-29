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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = head;
        int num = 1;
        while(tail.next != null){
            tail = tail.next; 
            num++;
        }
        if(n==1 && num ==1) return null;
        if(n == num) return head.next;
        tail= head;
        for(int i=1; i<num-n; i++){
            tail = tail.next;
        }
        if(tail.next== null){
            tail.next = null;
            return head;
        }
        tail.next = (tail.next).next;
        return head;
    }
}