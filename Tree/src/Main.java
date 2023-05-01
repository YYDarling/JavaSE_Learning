public class Main {
    public static void main(String[] args) {
       Tree<Character> node_1 = new Tree<>('a');
       Tree<Character> node_2 = new Tree<>('b'); 
       Tree<Character> node_3 = new Tree<>('c');
       Tree<Character> node_4 = new Tree<>('d');
       Tree<Character> node_5 = new Tree<>('e');

       node_1.left = node_2;
       node_1.right = node_3;
       node_2.left = node_4;
       node_2.right = node_5;

        System.out.println(node_1.left.left.element);
    }
}