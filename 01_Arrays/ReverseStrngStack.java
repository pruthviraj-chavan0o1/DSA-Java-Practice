
import java.util.Stack;

public class ReverseStrngStack {

    public static void main(String[] args) {

        String str = "JAVA";

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";

        // Pop characters from stack
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
