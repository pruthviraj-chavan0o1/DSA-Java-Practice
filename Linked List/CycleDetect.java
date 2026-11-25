
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CycleDetect {

    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;       // Move 1 step
            fast = fast.next.next;  // Move 2 steps

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Create a cycle 40 points back to 20
        head.next.next.next.next = head.next;

        if (hasCycle(head)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle");
        }
    }
}
