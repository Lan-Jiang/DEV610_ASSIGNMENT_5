import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ch14ex1_splitStack {

    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        int negativesCount = 0;

        // Move elements from the stack to the queue, counting the number of negative elements
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < 0) {
                negativesCount++;
            }
            queue.add(num);
        }

        // Move elements back from the queue to the stack in the desired order
        while (!queue.isEmpty()) {
            int num = queue.remove();
            if (num < 0) {
                negativesCount--;
            }
            stack.push(num);
        }

        // Move negative elements to the bottom of the stack
        for (int i = 0; i < negativesCount; i++) {
            stack.push(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(-5);
        stack.push(1);
        stack.push(2);
        stack.push(-4);

        System.out.println("Original stack: " + stack);
        splitStack(stack);
        System.out.println("Rearranged stack: " + stack);
    }


}
