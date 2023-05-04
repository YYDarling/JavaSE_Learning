import java.util.*;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        //Collection -> Queue -> Dequeue
        //
        Queue<String> queue = new LinkedList<String>();  //可以直接当queue来用
        queue.add("AAA");
        queue.add("BBB");
        queue.add("CCC");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        //双端队列：Deque
        Deque<String> stack = new LinkedList<String>();
        stack.push("AAA");
        stack.push("BBB");
        stack.push("CCC");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        //
        Deque<String> arr = new ArrayDeque<>();   //数组实现的栈和队列

        //10, 1, 5 ---> 1， 5， 10  why ?
        //因为有了优先级， 默认小的拍前面
        Queue<Integer> priorityQueue = new PriorityQueue<>();  //优先级队列， 从小到大
        Queue<Integer> priorityQueue_1 = new PriorityQueue<>((a, b) -> b - a);  //优先级队列， 使用比较器， 从大到小
        priorityQueue.offer(10);
        priorityQueue.offer(1);
        priorityQueue.offer(5);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        //

    }
}