import Entites.Student;
import Entites.Study;
import Entites.Test;

public class Main {
    public static void main(String[] args) {
        Test.Inner.test();
        //外部类初始化
        System.out.println(Test.test);

        Student stu = new Student(){  //实现未实现的抽象方法
            String name = "Amber";
            @Override
            public void test() {
                System.out.println("show " + name);
            }
        };
        stu.test();

        Study study = new Study(){
            @Override
            public void study() {
                System.out.println("我是匿名内部类");
            }
        };
        study.study();
    }



}