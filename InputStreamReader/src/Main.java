import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*
        (1)转换流
        （2）解释： 我这里读取的是一个字符串或是一个个字符，但是我只能往一个OutputStream里输出，
        但是OutputStream又只支持byte类型，如果要往里面写入内容，进行数据转换就会很麻烦
         */

        //输出
        try(OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("test.txt"))){  //虽然给定的是FileOutputStream，但是现在支持以Writer的方式进行写入
            writer.write("lbwnb");   //以操作Writer的样子写入OutputStream
            //会转换成我我们想要的byte类型
        }catch (IOException e){
            e.printStackTrace();
        }

        //输入
        //可以使用疯狂套娃战术
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")))){  //虽然给定的是FileInputStream，但是现在支持以Reader的方式进行读取
            System.out.println((char) reader.read());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}