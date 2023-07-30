import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ch14ex11_reorder {

    public static void reorder(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (stack.isEmpty() || current >= Math.abs(stack.peek())) {
                stack.push(current);
            } else {
                while (!stack.isEmpty() && current < Math.abs(stack.peek())) {
                    queue.add(stack.pop());
                }
                stack.push(current);
            }
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(-2);
        queue.add(4);
        queue.add(-5);
        queue.add(8);
        queue.add(-8);
        queue.add(12);
        queue.add(-15);

        reorder(queue);
        System.out.println(queue);
    }
}
