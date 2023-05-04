import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //迭代器
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        //通过调用iterator方法快速获取当前集合的迭代器
        //Iterator迭代器本身也是一个接口，由具体的集合实现类来根据情况实现
        Iterator<Integer> iterator = list.iterator();  //list 迭代器遍历， 这是普通迭代器

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
// 使用迭代器效率会变高
        //迭代器是一次性的

        //效率很低
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));  //list ��代器遍历， 这是普通��代器
        }

//        public static void main(String[] args) {
//            List<String> list = Arrays.asList("A", "B", "C");
//            list.forEach(System.out::println);
//        }
    }
}