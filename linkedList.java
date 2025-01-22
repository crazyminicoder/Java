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

    public static void main(String args[]) {
        linkedList ll = new linkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(5);
        ll.add(15);
        ll.add(25);

        ll.printll();
    }
}
