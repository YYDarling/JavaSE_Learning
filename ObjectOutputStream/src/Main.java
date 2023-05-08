import java.io.*;

public class Main {
    public static void main(String[] args) {

        /*
        ObjectOutputStream不仅支持基本数据类型，通过对对象的序列化操作，以某种格式保存对象，来支持对象类型的IO操作。
         */

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("output.txt")); //创建一个ObjectOutputStream输出流
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("output.txt"))){ //创建一个ObjectInputStream输入流
            People people = new People("lbw"); //创建一个People对象
            outputStream.writeObject(people); //将people对象写入到输出流中
            outputStream.flush(); //刷新输出流
            people = (People) inputStream.readObject();  //从输入流中读取一个对象
            System.out.println(people.name); //输出对象的name属性
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class People implements Serializable{   //必须实现Serializable接口才能被序列化
        String name;

        public People(String name){
            this.name = name;
        }
    }
}