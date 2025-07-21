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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = new ListNode();
        int sum = 0;
        ListNode head = null;
        while(l1 != null || l2 != null || sum !=0){
            node1 = new ListNode();
            if(l1 == null) l1 = new ListNode(0);
            if(l2 == null) l2 = new ListNode(0);
            sum += (l1.val + l2.val);
            node1.val = (sum % 10);
            sum = (sum>=10) ? 1 : 0;
            node1.next = head;
            head = node1;
            l1 = l1.next;
            l2 = l2.next;
        }
        

        head = null;
        ListNode node2 = new ListNode();
        while(node1 != null){
            node2 = new ListNode();
            node2.val = node1.val;
            node2.next = head;
            head = node2;
            node1 = node1.next;
        }


        return node2;
    }
}