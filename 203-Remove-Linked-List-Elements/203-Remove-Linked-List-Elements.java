//-----------Iterative approach--------------------------
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}

// -------------------Using Stack----------------------------------

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;

        // simply push all the values other than those
        // that needs to be deleted from the list
        while (curr != null) {
            if (curr.val != val) {
                stack.push(curr);
            }
            curr = curr.next;
        }
        // now there are only those values in the stack
        // which should be present after deletion

        ListNode newHead = null;

        // taking out all the values from
        // stack one by one and returning the new head.
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            node.next = newHead;
            newHead = node;
        }
        return newHead;
    }
}
