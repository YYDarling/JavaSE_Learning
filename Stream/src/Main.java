import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aaaa", "Sadsa", "Sadsa", "xx", "add", "Xss","Lbwnb"));
        //删除长度不大于3的字符串
        //删除首字母不为大写的字符串
        //去掉重复的字符串

        //怎么用stream来精简代码
        //filter 是不过滤哪一些东西
        list.stream()
              .filter(s -> s.length() > 3)   // filter: 断言表达式 保留的条件
              .filter(s -> s.charAt(0) >= 'A'&& s.charAt(0) <= 'Z')  //
              .distinct()   //去重.
              .collect(Collectors.toList()) //重新收集成为一个List
              .forEach(System.out::println);
        System.out.println(list);
        System.out.println("-----------------");

        //使用map 转换类型 string -> int
        List<Integer> collect_2 = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect_2);
        System.out.println("________________________________________________________________");

        //random number generator
        Random random = new Random();
        random
                .ints(-100, 100) //生成-100～100 之间的， 随机int 数字
                .limit(10)  // 限制范围, 只获取前10个数字
                .filter(i -> i % 2 == 0) // 过滤奇数
                .sorted()
                //.sorted((a, b) -> b - a) // 排序
                .forEach(System.out::println);



    }
}