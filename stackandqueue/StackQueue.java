package stackandqueue;
import java.util.LinkedList;
public class StackQueue {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        System.out.println(stack.pop()); // 70
        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 56
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(56);
        queue.offer(30);
        queue.offer(70);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
