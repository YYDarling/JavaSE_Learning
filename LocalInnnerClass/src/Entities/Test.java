package Entities;

/**
 * @title: Test
 * @Auther: Yun
 * @Date: 4/29/23 15:56
 * @Version 1.0
 */

public class Test {
    //局部内部类就像局部变量一样，可以在方法中定义。
    private final String name;

    public Test(String name){
        this.name = name;
    }

    public void hello() {
        class Inner {    //直接在方法中创建局部内部类
            public void test() {
                System.out.println("我是局部内部类");
            }
        }

        Inner inner = new Inner();   //局部内部类直接使用类名就行
        inner.test();
    }
//只不过这种局部内部类的形式，使用频率很低，基本上不会用到，所以说了解就行了。
}
