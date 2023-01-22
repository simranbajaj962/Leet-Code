class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        // find length
        ListNode current = head;
        int length = 1;
        while (current.next != null) {
            length++;
            current = current.next;
        }

        // point last node to head
        current.next = head;
        k = k % length;

        // going to the node
        int i = length - k;
        while (i-- > 0) {
            current = current.next;
        }

        // declare the new head and break connection
        head = current.next;
        current.next = null;

        return head;
    }
}
