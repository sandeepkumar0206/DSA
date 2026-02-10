/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        int cnt=0;
        while(head!=null){
            head=head.next;
            cnt++;
        }
        return cnt;
        
    }
}