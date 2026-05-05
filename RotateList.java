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
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=head;
        int len=1;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
        curr.next=head;
        k=k%len;
        curr=head;
        for(int i=1;i<len-k;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        // System.out.println(len);
        return head;

    }
}