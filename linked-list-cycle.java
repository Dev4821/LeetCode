public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            if(fast.next.next==slow)
            {
                return true;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return false;
    }
}
