package linkledList;

public class b707_linkedList {
    public class node {
        public int data;
        public node next;

        public node(int data) {
            this.data = data;
        }
    }

    node head;

    public int get(int index) {
        try {
            node number = head;
            while (index != 0) {
                number = number.next;
                index--;
            }
            return number.data;
        } catch (NullPointerException e) {
        }
        return -1;
    }

    public void addAtHead(int val) {
        node newNode = new node(val);
        newNode.next = head;
        head = newNode;

    }

    public void addAtTail(int val) {
        node newNode = new node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        node myNode = head;
        while (myNode != null) {
            if (myNode.next == null) break;
            myNode = myNode.next;
        }
        myNode.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        node newNode = new node(val);
        node iNode = head;
        node jNode = null;
        try {
            while (iNode != null) {
                if (index == 0) {
                    newNode.next = iNode;
                    jNode.next = newNode;
                    break;
                }
                jNode = iNode;
                iNode = iNode.next;
                index--;
            }
            jNode.next = newNode;
        } catch (NullPointerException ignored) {
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            return;
        }
        try {
            node node = head;
            node inode = null;
            while (node != null) {
                if (index == 0) {
                    inode.next = node.next;
                    break;
                }

                inode = node;
                node = node.next;
                index--;
            }
        } catch (NullPointerException e) {
        }
    }

}
