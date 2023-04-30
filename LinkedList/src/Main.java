import Entity.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.insert("a", 0);
        list.insert("b", 1);
        list.insert("c", 2);
        System.out.println(list);
    }
}