import Entities.Test;
import Entities.Test_2;

public class Main {
    public static void main(String[] args) {

//        Test test = new Test("yundu");   //我们首先需要创建对象 : 外部类对象
//        Test.Inner inner = test.new Inner();   //成员内部类的类型名称就是 外层.内部类名称 ： 内部类 ： test.new Inner(), public
//        inner.test();

        Test a = new Test("小明");
        Test.Inner inner1 = a.new Inner();   //依附于a创建的对象，那么就是a的
        // 创建成员内部类
        inner1.test();

        Test_2 b = new Test_2("小红");
        Test_2.Inner inner2 = b.new Inner();  //依附于b创建的对象，那么就是b的
        inner2.test("xiao gang");

        //方法参数的name = xiao gang
        //成员内部类的name = null  //在内部类中使用this关键字，只能表示内部类对象
        //成员内部类的name = 小红  //如果需要指定为外部的对象，那么需要在前面添加外部类型名称

    }
}