import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ch14ex7_reverseHalf {

   public static void reverseHalf(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        int size = queue.size();

        // Move elements in odd-numbered positions to the stack
        for (int i = 0; i < size; i++) {
            int num = queue.poll();
            if (i % 2 != 0) {
                stack.push(num);
            }
            queue.add(num);
        }

        // Enqueue elements from the stack back to the queue at odd positions
        for (int i = 0; i < size; i++) {
            int num = queue.poll();
            if (i % 2 != 0) {
                queue.add(stack.pop());
            }
            queue.add(num);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(8);
        queue.add(7);
        queue.add(2);
        queue.add(9);
        queue.add(18);
        queue.add(12);
        queue.add(0);

        System.out.println("Original queue: " + queue);
        reverseHalf(queue);
        System.out.println("Reversed half queue: " + queue);
    }




}
