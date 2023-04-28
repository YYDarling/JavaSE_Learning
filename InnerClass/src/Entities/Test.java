package Entities;

/**
 * @title: Test
 * @Auther: Yun
 * @Date: 4/27/23 22:22
 * @Version 1.0
 */

public class Test {

    private final String name;

    public Test(String name){
        this.name = name;      //在成员内部类中，是可以访问到外层的变量的
        ///但是外部不能访问到内部类中的变量，因为内部类中不能有成员变量、方法等
    }
        public class Inner {   //内部类也是类，所以说里面也可以有成员变量、方法等，甚至还可以继续套娃一个成员内部类

            public static String test;
            public void test(){
                System.out.println("我是成员内部类！" + name);
            }
        }
}
