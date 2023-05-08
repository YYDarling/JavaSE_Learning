import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(PrintStream stream = new PrintStream(new FileOutputStream("test.txt"))){
            stream.println("lbwnb");   //其实System.out就是一个PrintStream
        }catch (IOException e){
            e.printStackTrace();
        }

        int a = 10, b = 20;
        System.out.printf("a = %d, b = %d", a, b);  //c语言， 打印 integer
        System.out.printf("%s", "lbwnb");  //c语言， 打印 string
        System.out.printf("%.3f", 10.0);  //c语言， 打印 float, 保留3位小数
        System.out.printf("%c", 'a');  //c语言， 打印 char
        System.out.printf("%b", true);  //c语言， 打印 boolean
        System.out.printf("%d\n", 10);  //c语言， 打印 integer
        System.out.printf("%3d\n", 10);  //c语言， 打印 integer, 向右对齐， 保留三位
        System.out.printf("%-3d\n", 10);  //c语言， 打印 integer, 向左对齐， 保留三位

        /*
        Scanner scanner = new Scanner(System.in);
         */
        Scanner scanner = new Scanner(System.in); //从键盘读取数据, 接受输入流
        int num = scanner.nextInt();  //读取一个整数
        System.out.println(num);


        //从文件中读取数据
        try (Scanner scanner1 = new Scanner(new FileInputStream("test.txt"))){ //从文件读取数据
            System.out.println(scanner1.nextLine()); //读取一行
        }catch (IOException e){
            e.printStackTrace(); //打印错误信息
        }



    }
}