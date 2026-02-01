
class Solution {
    public static Node rev(Node head){
        Node prev=null;
        while(head!=null){
            Node n=head.next;
            head.next=prev;
            prev=head;
            head=n;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        head=rev(head);
        Node ans=head;
        int carry=1;
        while(carry!=0 && head!=null){
            carry+=head.data;
            head.data=carry%10;
            carry=carry/10;
            if(head.next!=null){
                head=head.next;
            }
            else{
                break;
            }
        }
        if(carry!=0){
            head.next=new Node(carry);
        }
        // return ans;
        return rev(ans);
    }
}
