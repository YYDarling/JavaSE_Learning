/**
 * @title: Tree
 * @Auther: Yun
 * @Date: 4/30/23 21:20
 * @Version 1.0
 */

public class Tree<E> {

    public E element;
    public Tree<E> left, right;

    public Tree(E element){
        this.element = element;
    }
}

