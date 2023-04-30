package Entity;

/**
 * @title: LinkedList
 * @Auther: Yun
 * @Date: 4/30/23 14:02
 * @Version 1.0
 */

public class LinkedList<E> {

    //头节点
    private Node<E> head = new Node<E>(null);
    private int size = 0;   //记录一下长度

    /*
    1. 构建Node类
     */
    private static class Node<E> {  //节点类， 仅供内部使用：
        private E element;  //每个节点都存放元素
        Node <E> next;  //以及指向下一个节点的引用

        public Node(E element) {  //构造方法
            this.element = element;
        }
    }

    /*
    2.添加元素
     */

    public void insert(E element, int index) {

        //  先进行判断
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("插入位置非法， 合法的插入位置范围为0~" + (size - 1));
        }

        //  先创建一个新的节点, 创建我们需要的newnode
        Node<E> newNode = new Node<E>(element);
        //怎么找到index要插入点的Node： 先找到要插入的节点
        Node<E> pre = head;
        for (int i = 0; i < index; i++) {    //找到index的前一个节点   head -> 1 -> 2 -> 3 -> null, assume 现在index = 1, 要找node (1), index = 0
            pre = pre.next;  //找到index 前的一个节点，记为pre
        }
        //创建我们需要的newnode
        //顺序不能反了
        newNode.next = pre.next;   //新node.next指向pre.next，就是原来点的位置
        pre.next = newNode;  //之前pre.next 一定要指向新节点
        size++;
    }

    /*
    3.删除元素
     */

    public E delete(int index) {
        //head -> 1 -> 2 -> 3 -> null， assume 我现在要删除index = 1的元素， 也就是值为2
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("删除位置非法， 合法的删除位置范围为0~" + (size - 1));
        }

        //  先找到要删除的节点
        Node<E> pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;  //找到 1
        }
        //  先找到要删除的节点的前一个节点
        E e = pre.next.element;  //告诉我删掉的元素是哪个
        pre.next = pre.next.next;
        size--;
        return e;
    }

    /*
    4.查找元素
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("查找位置非法， 合法的查找位置范围为0~" + (size - 1));
        }

        Node<E> pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;  //找到 1 ，，都是找到前一个元素， 返回下一个pre.next
        }
        return pre.next.element;
    }

    /*
    Notes；打印链表元素
     */

    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<E> node = head.next;   //从第一个结点开始，一个一个遍历，遍历一个就拼接到字符串上去
        while (node != null) {
            builder.append(node.element).append(" ");
            node = node.next;
        }
        return builder.toString();
    }




}
