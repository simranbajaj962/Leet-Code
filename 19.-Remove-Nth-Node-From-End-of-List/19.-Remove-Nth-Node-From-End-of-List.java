class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // In case id there is only one node or no node at all
        if (head == null || head.next == null)
            return null;

        ListNode fast = head;
        ListNode slow = head;

        // moving the fast pointer to create a gap of n between slow and fast pointer
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // if while making a gap, fast reaches the last that means there is only n
        // number of nodes in the list, so the head must be deleted which would be the
        // nth node from the last eventually.
        if (fast == null)
            return head.next;

        // after creating a gap, move both pointers by one step
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // deleting the node
        slow.next = slow.next.next;

        return head;
    }
}