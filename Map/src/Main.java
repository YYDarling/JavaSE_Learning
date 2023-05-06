import Entity.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        //key 不允许重复
        //hashmap 并不维持顺序
        System.out.println(map.get(1));
        System.out.println(map.containsValue("one"));
        System.out.println(map.containsKey(1));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());   //直接返回一对 ：[1=one, 2=two]
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });
        //1:one
        //2:two

        //要使用维持顺序的， 要使用linkedhashmap
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(4, "four");
        linkedMap.put(3, "three");
        System.out.println(linkedMap.get(3));
        System.out.println(linkedMap.containsValue("one"));
        System.out.println(linkedMap.containsKey(3));
        System.out.println(linkedMap.keySet());
        System.out.println(linkedMap.values());
        map.forEach((k , v ) -> System.out.println((k + " : " + v )));  //lambda

        //TreeMap
        //Map<Integer, String> treeMap = new TreeMap<>(); //和TreeSet类似
        Map<Integer, String> treeMap = new TreeMap<>((a, b) -> (b - a));
        treeMap.put(4, "four");
        treeMap.put(3, "three");
        System.out.println(treeMap.get(3));
        System.out.println(treeMap.containsValue("one"));
        System.out.println(treeMap.containsKey(3));
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());

        //map中其他方法

        //1. compute方法
        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "A");
        map3.put(2, "B");
        //存在， 如果不存在返回null
        map3.compute(1, (k, v) -> {   //compute会将指定Key的值进行重新计算，若Key不存在，v会返回null
            return v+"M";     //这里返回原来的value+M  //AM
        });
        //如果存在ifpresent
        map3.computeIfPresent(2, (k, v) -> {   //当Key存在时存在则计算并赋予新的值
            return v+"N";     //这里返回原来的value+M
        });
        //如果不存在ifabsent
        map3.computeIfAbsent(0, (k) -> {   //若不存在则计算并插入新的值
            return "null";     //这里返回M
        });
        System.out.println("map3 : "+ map3);

        //2. merge方法: 可以对重复键的值进行特殊操作，比如我们想计算某个学生的所有科目分数之后，那么就可以像这样：
        List<Student> students = Arrays.asList(
                new Student("yoni", "English", 80),
                new Student("yoni", "Chiness", 98),
                new Student("yoni", "Math", 95),
                new Student("taohai.wang", "English", 50),
                new Student("taohai.wang", "Chiness", 72),
                new Student("taohai.wang", "Math", 41),
                new Student("Seely", "English", 88),
                new Student("Seely", "Chiness", 89),
                new Student("Seely", "Math", 92)
        );
        Map<String, Integer> scoreMap = new HashMap<>();
        //merge方法可以对重复键的值进行特殊操作，比如我们想计算某个学生的所有科目分数之后，那么就可以像这样：
        students.forEach(student -> scoreMap.merge(student.getName(), student.getScore(), Integer::sum));
        scoreMap.forEach((k, v) -> System.out.println("key: " + k + "总分 " + "value: " + v));

        //replace方法
        Map<Integer , String> map4 = new HashMap<>();
        map4.put(0, "单走");
        map4.replace(0, "杜云是大笨蛋");   //直接替换为新的
        map.replace(0, "巴卡", "杜云是大笨哒");   //只有键和值都匹配时，才进行替换
        System.out.println(map4);

        //remove方法
        Map<Integer, String> map5 = new HashMap<>();
        map5.put(1, "one");
        map5.put(2, "two");
        map5.put(3, "three");
        map5.remove(1);
        map5.remove(2);
        map5.remove(3);
        System.out.println(map5);

        //getOrDefault(key, value):
        map.getOrDefault(1, "one");
        //说明如果没有1 就是用one来填补



    }
}