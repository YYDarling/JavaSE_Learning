import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        //Genreral;
        Math.pow(5,7); //5的7次方
        Math.abs(-10); //绝对值
        Math.max(1,2);   //最大
        Math.min(1,2);  //最小
        Math.sqrt(4);  //算术平方根  //2

        //三角函数：
//        Math.sin(Math.PI / 2);   //求pi / 2 的正弦值
//        Math.cos
//        Math.tan
//
//        Math.asin   //求三角函数的反函数
//        Math.acos
//        Math.atan

        Math.log(Math.E);  //e为对数函数， 其实就是ln, 可以直接使用math中定义好的e
        Math.log10(100);
        Double a = Math.log(4) / Math.log(2);
        System.out.println("a is " + a);

        //向上取整
        Math.ceil(3.14);
        System.out.println(Math.ceil(3.14));   //4 向上取出
        System.out.println(Math.ceil(-3.14));  //-3

        //向下取整
        Math.floor(3.14);
        System.out.println("floor is  " + Math.floor(3.14));  //3.0
        System.out.println("- floor is  " + Math.floor(-3.14));  //-4.0

        //随机数
        Random random = new Random();
        System.out.println(random.nextInt(100));  //随机生成一个整数
        System.out.println(random.nextDouble(10));  //随机生成一个数



    }
}