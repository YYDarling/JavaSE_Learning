import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
            (1)注意，IO相关操作会有很多影响因素，有可能出现异常，所以需要明确进行处理
            (2)指明完成的路径： window里要\\两个反斜杠，linux里要/一个正斜杠
            (3)FileInputStream inputStream = new FileInputStream("路径");
            (4)FileInputStream inputStream = new FileInputStream("D:\\Java\\IO\\src\\Main.java");
            (5)FileInputStream inputStream = new FileInputStream("/Users/yun/Desktop/yun.html");
            (6)FileInputStream inputStream = new FileInputStream("../yun/Desktop/yun.html");
            (7)路径支持相对路径和绝对路径
            (8)使用流之后， 一定要关闭流，否则会造成内存泄漏
        */

        // 写法1: 创建文件流
//        FileInputStream inputStream = null;
//        try {
//            // 读取文件
//            inputStream = new FileInputStream("/Users/yun/Desktop/yun.html");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            // 关闭文件
//            try {
//                inputStream.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }

        // 写法2: 创建文件流 这样代码更加简洁
        //注意，这种语法只支持实现了AutoCloseable接口的类！
        try(FileInputStream inputStream = new FileInputStream("/Users/yun/Desktop/yun.html")) {
            //直接在try()中定义要在完成之后释放的资源
            int i = inputStream.read(); //读取一个字节
            while (i != -1) { //如果读取的字节不是-1，说明没有到达文件末尾, 读取全部的字节
                System.out.print((char) i);
                i = inputStream.read();
            }

            //一次性读取所有的字节
            //byte[] bytes = inputStream.readAllBytes();



        } catch (IOException e) {
            //这里变成IOException是因为调用close()可能会出现，而FileNotFoundException是继承自IOException的
            e.printStackTrace();
        }//finally{
            //这里不需要再写finally语句块了，因为在try()中定义的变量，会在代码执行完毕后自动释放
        //}
        //无需再编写finally语句块，因为在最后自动帮我们调用了close()

        /*
        try(FileInputStream inputStream = new FileInputStream("test.txt")) {
        System.out.println(inputStream.available());  //查看剩余数量
        }catch (IOException e){
            e.printStackTrace();
        }
         */

        /*
        //test.txt：abcd
        try(FileInputStream inputStream = new FileInputStream("test.txt")) {
            System.out.println(inputStream.skip(1));
            System.out.println((char) inputStream.read());   //跳过了一个字节
        }catch (IOException e){
            e.printStackTrace();
        }
         */

        /*
        (1)输出流：OutputStream
         */

//        try (FileOutputStream stream = new FileOutputStream("test.txt",true)) { //加上true的话，就变成追加模式， 一直会继续写
//            stream.write("hello world".getBytes());  //可以定义从哪里开始写， 到哪里结束
//            stream.flush(); //刷新缓冲区, 将缓冲区的内容写入文件,立即生效
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /*
        (3) 文件拷贝
         */
        //1. 读取源文件test.mov
        try (FileInputStream in = new FileInputStream("test.mov");
             FileOutputStream out = new FileOutputStream("test2.mov")) {
            //2. 读取源文件内容
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = in.read(buffer)) != -1) { //读取到文件末尾，返回-1
                //3. 写入目标文件test2.mov
                out.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}