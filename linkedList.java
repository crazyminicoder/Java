class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedList {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printll() {
        if (head == null) {
            System.out.println("The linked list is empty");

        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.println("null");
        }

    }

    public Node merge(linkedList l1, linkedList l2) {
        linkedList l3 = new linkedList();

        Node l1c = l1.head;

        Node l2c = l2.head;
        while (l1c != null || l2c != null) {
            l3.add(l1c.data);
            l3.add(l2c.data);

            l1c = l1c.next;
            l2c = l2c.next;
        }

        // l3.printll();

        return l3.head;
    }

    public static void main(String args[]) {

        linkedList ll = new linkedList();
        
        linkedList ll2 = new linkedList();
        ll.add(1);
        ll.add(2);
        ll.add(4);
        ll2.add(1);
        ll2.add(3);
        ll2.add(4);

        ll.printll();
        ll2.printll();

        linkedList l3 = new linkedList();
        Node mergedList = l3.merge(ll, ll2);

        linkedList newMergedList = new linkedList();
        newMergedList.head = mergedList;

        newMergedList.printll();

    }
}
