import model.ListNode;
import java.util.Stack;

public class LinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();

        ListNode temp = new ListNode(0);
        ListNode result = temp;

        while(head != null) {
            stack.push(head);
            head = head.next;
        }

        while(!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
            temp.next = null;
        }

        return result.next;
    }
}
