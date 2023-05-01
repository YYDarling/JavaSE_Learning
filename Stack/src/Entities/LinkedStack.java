package Entities;

import java.util.NoSuchElementException;

/**
 * @title: LinkedStack
 * @Auther: Yun
 * @Date: 4/30/23 15:39
 * @Version 1.0
 */

public class LinkedStack<E> {

    private final Node<E> head = new Node<E>(null);

    /*
    1. 定义push入栈方法
     */

    public void push(E element) {
        Node<E> node = new Node<E>(element);
        node.next = head.next; //新节点的下一个变成斩顶节点 。。。。从后往前看
        head.next = node;  //头节点的下一个变成新节点
    }

    /*
    2.定义pop出栈方法
     */
    public E pop(){
        if (isEmpty()) {
            throw new NoSuchElementException("栈已经为空");
        }
        E e = head.next.element;
        head.next = head.next.next;
        return e;
    }

    /*
    3.判断是否为空
     */

    public boolean isEmpty() {
        return head.next == null;
    }
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

}
