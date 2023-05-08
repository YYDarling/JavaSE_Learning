import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        (1)一个中文三个字节，一个英文一个字节
        （2）字符流是按字节读取的，因此如果读取中文字符，可能会出现乱码
         */

        try(FileReader reader = new FileReader("test1.txt")){
            reader.skip(1);   //现在跳过的是一个字符
            System.out.println((char) reader.read());   //现在是按字符进行读取，而不是字节，因此可以直接读取到中文字符
        }catch (IOException e){
            e.printStackTrace();
        }

        //File类的使用
        //File类是对文件和文件夹进行操作的类
        File file = new File("/");
        //判断是否是文件夹
        System.out.println(file.isDirectory());
        //判断是否是文件
        System.out.println(file.isFile());
        //判断是否存在
        System.out.println(file.exists());
        //获取文件名
        System.out.println(file.getName());
        //获取文件大小
        System.out.println(file.length());
        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());
        //获取文件的父路径
        System.out.println(file.getParent());
        //创建文件夹
        File file1 = new File("test");
        System.out.println(file1.mkdir());  //创建目录
        System.out.println(file1.mkdirs());  //创建多级目录
        //创建文件
        File file2 = new File("test.txt");
        System.out.println(file2.createNewFile());
        //删除文件
        System.out.println(file2.delete());
        //剩余空间
        System.out.println(file.getFreeSpace() / 1024 / 1024 / 1024 + "GB"); //单位是字节，转换成GB
        //获取当前路径下的所有文件
        File file3 = new File("."); //当前路径
        File[] files = file3.listFiles(); //获取当前路径下的所有文件
    }
}