package Entity;

import java.util.Optional;

/**
 * @title: Test
 * @Auther: Yun
 * @Date: 4/27/23 21:13
 * @Version 1.0
 */



public class Test {
    public static void test(String str) {   //传入字符串，如果不是空串，那么就打印长度
//        if (str!= null) return;
//        if (!str.isEmpty()) {
//            System.out.println("字符串长度为：" + str.length());
//        }

        //Optional
                //.ofNullable(str)   //将传入的对象包装进Optional中
                //.ifPresent(s -> System.out.println("字符串长度为："+s.length()));
        //如果不为空，则执行这里的Consumer实现

        //String s = Optional.ofNullable(str).get();   //get方法可以获取被包装的对象引用，但是如果为空的话，会抛出异常
        //String s = Optional.ofNullable(str).orElse("备选方案");
        //System.out.println(s);
        //String s = Optional.ofNullable(str).orElseGet(() -> "备选方案");

        //map
        Integer i = Optional
                .ofNullable(str)
                .map(String::length)   //使用map来进行映射，将当前类型转换为其他类型，或者是进行处理
                .orElse(-1);
        System.out.println(i);


    }
}