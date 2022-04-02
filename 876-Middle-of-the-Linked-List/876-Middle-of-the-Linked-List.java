class Solution {
    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        current = head;
        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        return current;
    }

}
