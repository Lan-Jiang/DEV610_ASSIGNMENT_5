import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ch14ex2_stutter {

public static void stutter(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            int num = stack.pop();
            queue.add(num);
            queue.add(num);
        }

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(14);
        stack.push(9);

        stutter(stack);
        System.out.println(stack);
    }


}
