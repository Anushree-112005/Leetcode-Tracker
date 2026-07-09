// Last updated: 7/9/2026, 9:16:17 AM
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
public class Solution{
    public ListNode deleteDuplicates(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode current=head;
        while(current!=null&&current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }
}
