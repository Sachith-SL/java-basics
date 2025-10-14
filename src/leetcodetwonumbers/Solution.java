package leetcodetwonumbers;

public class Solution {
    //    using same instance with two reference variable (use dummy object);
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int x = (l1 != null) ? l1.getVal() : 0;
            int y = (l2 != null) ? l2.getVal() : 0;

            int sum = x + y + carry;
            int digit = sum % 10;
            carry = sum / 10;

            current.setNext(new ListNode(digit));
            current = current.getNext();

            if (l1 != null) l1 = l1.getNext();
            if (l2 != null) l2 = l2.getNext();
        }
        return dummy.getNext();
    }

    // recursive approach
    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {

        // Base case: when both are null and no carry
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int x = (l1 != null) ? l1.getVal() : 0;
        int y = (l2 != null) ? l2.getVal() : 0;

        int sum = x + y + carry;
        int digit = sum % 10;
        carry = sum / 10;

        // Create a new node for this digit
        ListNode node = new ListNode(digit);

        // Move to next nodes if available
        ListNode next1 = (l1 != null) ? l1.getNext() : null;
        ListNode next2 = (l2 != null) ? l2.getNext() : null;

        // Recursive call for the next digits
        node.setNext(addTwoNumbers(next1, next2, carry));

        return node;
    }

    public static void showIt(){
        ListNode l1 = new ListNode(2, new ListNode(4,new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6,new ListNode(4)));
        ListNode result = addTwoNumbers1(l1,l2);

        while(result !=null){
            System.out.println(result.getVal());
            result =result.getNext();
        }
    }
}
