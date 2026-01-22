class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode s=head;
        ListNode curr=head;
        ListNode f=head;
        while(curr.next!=null){
            if(n>0){
                s=s.next;
                n--;
            }
            else{
                f=f.next;
            }
            curr=curr.next;
        }
        if(n!=0){
            head=head.next;
        }
        else{
            f.next=f.next.next;
        }
        return head;
    }
}
