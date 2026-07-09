// Last updated: 7/9/2026, 9:15:33 AM

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null; 
        ListNode current=head; 
        while (current!=null) {
            ListNode nextTemp=current.next; 
            current.next=prev; 
            prev=current; 
            current=nextTemp; 
        }  
        return prev; 
    }
}