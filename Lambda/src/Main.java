import Entity.Study;

public class Main {
    public static void main(String[] args) {

        //如果一个接口中有且只有一个待实现的抽象方法，那么我们可以将匿名内部类简写为Lambda表达式：

        //匿名内部类的实现方式
        //Study study = new Study() {
        //    @Override
        //    public void study() {
       //         System.out.println("匿名内部类实现抽象接口");
        //    }
        //};

        //lambda表达式实现接口 ： lambda表达式的作用是将一个接口中的��象方法封装成一个��, 匿名内部类的简写

//        那么它是一个怎么样的简写规则呢？我们来看一下Lambda表达式的具体规范：
//
//        1.标准格式为：([参数类型 参数名称,]...) ‐> { 代码语句，包括返回值 }
//        2.和匿名内部类不同，Lambda仅支持接口，不支持抽象类
//        3.接口内部必须有且仅有一个抽象方法（可以有多个方法，但是必须保证其他方法有默认实现，必须留一个抽象方法出来）

        Study study = (int grades) -> {
            System.out.println("lambda表达式实现接口");
            return "我的年龄是 ： " + grades;
        };
        System.out.println(study.test_res(78));
    }
}