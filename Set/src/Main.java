import java.util.*;

public class Main {
    public static void main(String[] args) {

        //不允许出现重复元素
        //不支持随机访问（不允许通过下标访问）
        Set<String> set = new HashSet<>();  //实现类
        set.add("a");
        set.add("b");
        set.add("a");
        System.out.println(set.size());
        System.out.println(set.add("c"));

        //维持顺序的hashSet
        //可以使用维持顺序的LinkedHashSet
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        for (Integer integer : set1) {
            System.out.println(integer);
        }


        //快速的方法进行
        Set<String> set2 = new HashSet<>();
        set.addAll(Arrays.asList("A", "0", "-", "+"));
        System.out.println(set);

        //使用TreeSet进行加入， 会在底层进行自动排序
        //Set<Integer> set3 = new TreeSet<>();  //从小到大的顺序排列
        Set<Integer> set3 = new TreeSet<>((a, b) -> b - a);  //从大到小的顺序排列， lambda表达式
        set3.add(999);
        set3.add(888);
        set3.add(777);
        set3.add(666);
        set3.add(555);
        System.out.println(set3);
    }
}