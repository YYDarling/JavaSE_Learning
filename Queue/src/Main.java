import Entity.LinkedQueue;

public class Main {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}