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
        ListNode currans=l1;
        ListNode ans=l1;
        int carry=0;
        while(l1!=null && l2!=null ){
            int value=l1.val+l2.val+carry;
            l1.val=value%10;
            carry=value/10;
            currans=l1;
            l1=l1.next;
            l2=l2.next;
        }
        if(l2==null){
                while(l1!=null){
                int value=l1.val+carry;
                l1.val=value%10;
                carry=value/10;
                currans=l1;
                l1=l1.next;
            }
        }
        else{
            currans.next=l2;
            while(l2!=null){
                int value=l2.val+carry;
                l2.val=value%10;
                carry=value/10;
                currans=l2;
                l2=l2.next;
            }
        }
        if(carry>0){
            currans.next=new ListNode(carry);
        }
        return ans;

    }
}