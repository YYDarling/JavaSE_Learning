import Entities.Test;

public class Main {
    public static void main(String[] args) {

//        Test test = new Test("yundu");   //我们首先需要创建对象 : 外部类对象
//        Test.Inner inner = test.new Inner();   //成员内部类的类型名称就是 外层.内部类名称 ： 内部类 ： test.new Inner(), public
//        inner.test();

        Test a = new Test("小明");
        Test.Inner inner1 = a.new Inner();   //依附于a创建的对象，那么就是a的
        inner1.test();

        Test b = new Test("小红");
        Test.Inner inner2 = b.new Inner();  //依附于b创建的对象，那么就是b的
        inner2.test();

    }
}