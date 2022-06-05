package linkledList;

public class linkList_203_21 {
    public class ListNode {
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
    //203
    public ListNode removeElements(ListNode head, int val) {
        if (head != null && head.val == val) {
            head = head.next;
        }
        try {
            ListNode prev = null;
            ListNode cur = head;

            while (head != null) {
                if (cur.val == val) {
                    prev.next = cur.next;
                }
                if (cur.val != val) {
                    prev = cur;
                }
                cur = cur.next;
            }
        } catch (NullPointerException e) {
        }

        return head;
    }
//203
    public ListNode removeElements_deQui(ListNode head, int val) {
        if (head == null) return head;
        if (head.val == val) {
            return removeElements_deQui(head.next, val);
        } else {
            head.next = removeElements_deQui(head.next, val);
            return head;
        }
    }

    //21
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
