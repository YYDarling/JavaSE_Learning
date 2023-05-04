import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        1. 数组大小是固定的， 集合大小是可变的
        2.数组可以存放基本数据类型， 但是集合只能存放对象reference
         */
        //ArrayList<String> list = new ArrayList<>();
        //list.add("树脂666");

        List<String> list =  new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        //fori
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //list.for
//        for (String s : list) {  //强for循环
//            System.out.println(s);
//        }

//
        Iterator<String> iterator = list.iterator();







    }
}