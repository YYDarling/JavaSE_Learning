package Collection;

/**
 * @title: ArrayList
 * @Auther: Yun
 * @Date: 4/30/23 11:48
 * @Version 1.0
 */

public class ArrayList<E> {  //泛型E，因为表中要存的具体数据类型待定
    private int size = 0;  //当前顺序表的容量
    private int capacity = 10;  //当前已经存放的元素数量
    private Object[] array = new Object[capacity]; //底层存放数据的数组

    public void add(E element, int index){

        //如果插入的位置超出了size范围，就要进行一个判断
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("插入位置异常， 合法的插入位置为 ： 0 ～ " + size);
        }

        //如果满了就要扩容
        if (size >= capacity){
            capacity *= 2;    //扩容为原来的2倍
            Object[] newArray = new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        //This is the main function
        for (int i = size; i > index; i--) {  //从后往前搬， 因为从前往后会覆盖
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index){
        //可删除的范围只能是从0到size-1
        if (index > size - 1 || index < 0){
            throw new IndexOutOfBoundsException("删除位置异常， 合法的删除位置为 ： 0 ～ " + size);
        }
        //后面的从后往前搬
        //在删除之前把元素给取出来
        //E e = (E)array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];  //后面的搬到前面来
        }
        size--;
        return (E) array[index];
        //return e
    }

    public E get(int index){
        if (index > size - 1 || index < 0){
            throw new IndexOutOfBoundsException("获取位置异常， 合法的获取位置为 ： 0 ～ " + size);
        }
        return (E) array[index];
    }
    public String toString() {
        System.out.println(capacity);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) builder.append(array[i]).append(" ");
        return builder.toString();
    }

}
