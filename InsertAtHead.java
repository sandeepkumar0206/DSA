class Solution {
    public int getCount(Node head) {
        int cnt=0;
        while(head!=null){
            head=head.next;
            cnt++;
        }
        return cnt;
    }
}""