class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteNode {

    public static Node deleteNode(Node head, int key) {

        if (head == null) {
            return null;
        }

        if (head.data == key) {
            return head.next;
        }

        Node temp = head;

        while (temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return head;
            }

            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteNode(head, 30);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}