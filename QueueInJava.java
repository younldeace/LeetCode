import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println("The first element is: " + q.peek());
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println("The first element is: " + q.peek());
        q.poll();
        System.out.println("The first element is: " + q.peek());
        System.out.println("The first element is: " + q.size());
    }
}
