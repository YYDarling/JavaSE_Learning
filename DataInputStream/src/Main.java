import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test.txt"))){
            System.out.println(dataInputStream.readBoolean());   //直接将数据读取为任意基本数据类型
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}