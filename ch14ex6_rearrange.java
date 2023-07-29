import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ch14ex6_rearrange {

    public static void rearrange(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        int size = queue.size();
        // Move even elements to the stack and enqueue odd elements back to the queue
        for (int i = 0; i < size; i++) {
            int num = queue.poll();
            if (num % 2 == 0) {
                stack.push(num);
            } else {
                queue.add(num);
            }
        }

        // Move elements from the stack back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(4);
        queue.add(17);
        queue.add(6);
        queue.add(83);
        queue.add(1);
        queue.add(84);
        queue.add(16);
        queue.add(37);

        System.out.println("Original queue: " + queue);
        rearrange(queue);
        System.out.println("Rearranged queue: " + queue);
    }


}
