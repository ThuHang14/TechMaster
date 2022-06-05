package linkledList;

public class b206 {
    //
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode s = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return s;
    }

    //
    public static ListNode reverseList_3(ListNode head) {
        return reverse(head, null);
    }

    public static ListNode reverse(ListNode head, ListNode newNode) {
        if (head == null) {
            return newNode;
        }
        ListNode next = head.next;
        head.next = newNode;
        newNode = head;
        head = next;
        return reverse(head, newNode);
    }

    //
    public static ListNode reverseList_(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode s = reverseList_(head.next);
        ListNode temp = s;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return s;
    }

    //
    public static ListNode reverseList_2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = null;
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
