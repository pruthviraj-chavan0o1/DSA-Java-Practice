
public class QueueArray {

    int[] queue = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int value) {

        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println("Inserted: " + value);
        }
    }

    void dequeue() {

        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Removed: " + queue[front]);
            front++;
        }
    }

    void peek() {

        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    void display() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
        q.peek();
        q.display();
    }
}
