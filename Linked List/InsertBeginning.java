
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertBeginning {

    Node head;

    void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        InsertBeginning list = new InsertBeginning();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.insertAtBeginning(5);

        list.display();
    }
}
