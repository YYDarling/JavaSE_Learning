import Entity.Student;

import java.util.function.Predicate;

public class Main {

    //public static void main(String[] args) {

    //1. Supplier : 专门供给Student对象Supplier
    //Supplier<Student> studentSupplier = new Supplier<Student>()
    //Supplier<Student> studentSupplier = () -> new Student();  //lambda表达式
    //Supplier<Student> studentSupplier = Student::new;  //构造函数
    //studentSupplier.get().hello();

    //2. Consumer : 专门消费Student对象 ,消费学生的参数
    //Consumer<Student> studentConsumer = (Student student) -> student.hello();
    //studentConsumer
    //        .andThen(student -> System.out.println("hahha"))    //不加；
    //        .accept(new Student());

    //3. Function : 专门处理Student对象
    //这里实现了一个简单的功能，将传入的int参数转换为字符串的形式
    //private static final Function<Integer, String> INTEGER_STRING_FUNCTION = Object::toString;
    //public static void main(String[] args) {
        //专门消费student对象consumer
        //这里实现了一个简单的功能，将传入的int参数转换为字符串的形式
        //String str = INTEGER_STRING_FUNCTION.apply(10);
        //System.out.println(str);
    //}

    //private static final Function<Integer, String> INTEGER_STRING_FUNCTION = Object::toString;
    //接收一个integer作为实参, 返回一个字符串
    //function： （1）前置操作
    //public static void main(String[] args) {
        //String str = INTEGER_STRING_FUNCTION
                //这里是添加了一些前置的工序，倒着推
                //.compose(String :: length)   //将此函数式的返回值作为当前实现的实参
                //.apply("lbwnb");   //传入上面函数式需要的参数
        //System.out.println(str);
    //}
    //str --> Integer --> String
    //lbwanb -> 5 -> "5"  //倒着

    //function： （2）后置操作
    //private static final Function<Integer, String> INTEGER_STRING_FUNCTION = Object::toString;
    //public static void main(String[] args) {
        //Boolean str = INTEGER_STRING_FUNCTION
                //后序操作
                //.andThen(String::isEmpty)   //在执行完后，返回值作为参数执行andThen内的函数式，最后得到的结果就是最终的结果了
                //.apply(10);  //反着来
        //System.out.println(str);
    //}

    //4. Predicate断言型函数式接口：接收一个参数，然后进行自定义判断并返回一个boolean结果。
    private static final Predicate<Student> STUDENT_PREDICATE = student -> student.score >= 60;
    public static void main(String[] args) {
        Student student = new Student();
        student.score = 40;
        if(STUDENT_PREDICATE.test(student)) {  //test方法的返回值是一个boolean结果
            System.out.println("及格了，真不错，今晚奖励自己一次");
        } else {
            System.out.println("不是，Java都考不及格？隔壁初中生都在打ACM了");
        }
    }






}