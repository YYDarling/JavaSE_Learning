package Entity;

import java.util.NoSuchElementException;

/**
 * @title: LinkedQueue
 * @Auther: Yun
 * @Date: 4/30/23 20:52
 * @Version 1.0
 */

public class LinkedQueue<E>{

    private Node<E> head = new Node<>(null);
    private Node<E> tail = new Node<>(null);

    /*
    0.定义Node内部类
     */
    private static class Node<E> {  //内部类
        private E element;
        private Node<E> next;
        public Node(E element) {
            this.element = element;
        }
    }

    /*
    1.定义isEmpty方法
     */
    public boolean isEmpty() {
        return head.next == null;
    }
    /*
    2.定义offer方法
     */
    public void offer(E element){
        Node<E> tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = new Node<>(element);
    }

    /*
    3.定义poll方法
     */
    public E poll(){
        if (isEmpty()){
            throw new NoSuchElementException("队列为空");
        }
        E e = head.next.element;
        head.next = head.next.next;
        return e;
    }
    /*
    4.定义peek方法
     */
    public E peek(){
        if (isEmpty()){
            throw new NoSuchElementException("队列为空");
        }
        return head.next.element;
    }
}
