package Entites;

/**
 * @title: Test
 * @Auther: Yun
 * @Date: 4/29/23 16:19
 * @Version 1.0
 */

public class Test {

    public static String test = "";

    static {
        System.out.println("外部类初始化");
    }

    public static class Inner{

        static {
            System.out.println("内部类初始化");
        }

        //定义了一个方法：test()
        public static void test(){
            System.out.println("我是静态内部类！");
        }
    }
}
