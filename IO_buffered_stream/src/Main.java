import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        // BufferedInputStream
         */
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("test.txt"))){   //传入FileInputStream
            bufferedInputStream.mark(0); //标记当前位置
            System.out.println((char)bufferedInputStream.read()); //读取一个字节
            System.out.println((char)bufferedInputStream.read()); //读取一个字节

            bufferedInputStream.reset(); //重置到标记位置‘0’
            System.out.println((char)bufferedInputStream.read()); //重新开始读取一个字节
            System.out.println((char)bufferedInputStream.read()); //重新开始读取一个字节


        }catch (IOException e){
            e.printStackTrace();
        }

        /*
         * Marks the current position in this input stream. A subsequent
         * call to the <code>reset</code> method repositions this stream at
         * the last marked position so that subsequent reads re-read the same bytes.
         * <p>
         * The <code>readlimit</code> argument tells this input stream to
         * allow that many bytes to be read before the mark position gets
         * invalidated.
         * <p>
         * This method simply performs <code>in.mark(readlimit)</code>.
         *
         * @param   readlimit   the maximum limit of bytes that can be read before
         *                      the mark position becomes invalid.
         * @see     java.io.FilterInputStream#in
         * @see     java.io.FilterInputStream#reset()
         */

        /*
        I/O操作一般不能重复读取内容（比如键盘发送的信号，主机接收了就没了），而缓冲流提供了缓冲机制，
        一部分内容可以被暂时保存，BufferedInputStream支持reset()和mark()操作，首先我们来看看mark()方法的介绍

         */


        /*
        （1）字符缓存流
         */
//        try (BufferedReader stream = new BufferedReader(new FileInputStream("test.txt"))) {
//            String line;
//            while ((line = stream
//                    .readLine()) != null) {  //读取一行
//
//                System.out.println(line);
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }

    }

}