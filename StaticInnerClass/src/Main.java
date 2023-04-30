import Entities.Test;

public class Main {
    public static void main(String[] args) {

        Test.Inner inner = new Test.Inner();   //静态内部类的类名同样是之前的格式，但是可以直接new了
        inner.test("2333");
    }
}