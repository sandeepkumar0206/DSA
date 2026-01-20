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
    public ListNode reverseList(ListNode head) {
        // ListNode prev=new null;
        ListNode ans=null;
        while(head!=null){
            ListNode nextt=head.next;
            head.next=ans;
            ans=head;
            head=nextt;
        }
        // prev=null;
        return ans;
    }
}