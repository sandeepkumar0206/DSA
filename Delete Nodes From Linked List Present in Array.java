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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode ans=new ListNode(-1);
        ans.next=head;
        head=ans;
        while(ans.next!=null){
            if(set.contains(ans.next.val)){
                ans.next=ans.next.next;
            }
            else{
                ans=ans.next;
            }
        }
        return head.next;
    }
}