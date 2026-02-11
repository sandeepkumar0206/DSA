class Solution {
    public static ListNode rev(ListNode head){
        if(head.next==null){
            return head;
        }
        ListNode curr=rev(head.next);
        head.next.next=head;
        head.next=null;
        return curr;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        return rev(head);
    }
}