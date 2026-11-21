
public class StackArray {

    int[] stack = new int[5];
    int top = -1;

    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    void display() {
        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StackArray s = new StackArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.peek();
        s.pop();
        s.display();
    }
}
