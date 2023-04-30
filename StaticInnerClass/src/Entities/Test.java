package Entities;

/**
 * @title: Test
 * @Auther: Yun
 * @Date: 4/28/23 23:08
 * @Version 1.0
 */

public class Test {
    private final String name;

    public Test(String name){
        this.name = name;
        System.out.println(Inner.test);
    }

    public static class Inner {   //加了static 属于这个类的属性， 可以直接用
        //静态内容初始化： 在成员变量之前
        static String test;
        public void test(String test){
            System.out.println("我是静态内部类！" + test);
        }
    }
}
