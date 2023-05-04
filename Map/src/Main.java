import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

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

    }
}