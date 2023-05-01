package Entity.LinkedList;
/**
 * @title: Node
 * @Auther: Yun
 * @Date: 4/30/23 15:43
 * @Version 1.0
 */ /*
1. 构建Node类
 */
public class Node<E> {  //节点类， 仅供内部使用：
    private E element;  //每个节点都存放元素
    Node<E> next;  //以及指向下一个节点的引用

    public Node(E element) {  //构造方法
        this.element = element;
    }
}
