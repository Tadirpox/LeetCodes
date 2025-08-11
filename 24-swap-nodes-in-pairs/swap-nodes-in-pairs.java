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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head; //Base Case
        ListNode tail = head;
        while(tail != null && tail.next != null){
            int num = tail.next.val;
            tail.next.val = tail.val;
            tail.val = num;
            tail = tail.next.next;
        }
        return head;
    }
}