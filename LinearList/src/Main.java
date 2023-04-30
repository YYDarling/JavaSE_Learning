import Collection.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(i + " ", 0);
        }
        //list.add("a", 0);
        //list.add("b", 0);

        //System.out.println(Arrays.toString(list)); //错误,要自己写一个println方程
        //打印
        System.out.println(list.get(3));
    }
}