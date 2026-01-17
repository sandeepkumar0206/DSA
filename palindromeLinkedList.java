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
    public static ListNode  find(ListNode head){
        ListNode l1=head;
        ListNode l2=head.next;
        while(l2!=null && l2.next!=null){
            l1=l1.next;
            l2=l2.next.next;
        }
        return l1;

    }
    public boolean isPalindrome(ListNode root) {
        if(root==null || root.next==null){
            return true;
        }
        ListNode curr=find(root);
        ListNode mid=curr.next;
        curr.next=null;
        mid=rev(mid);
        while(mid!=null){
            if(root.val!=mid.val){
                return false;
            }
            mid=mid.next;
            root=root.next;
        }
        return true;
    }
    public static ListNode rev(ListNode root){
        ListNode prev=null;
        while(root!=null){
            ListNode next=root.next;
            root.next=prev;
            prev=root;
            root=next;
        }
        return  prev;
    }
}