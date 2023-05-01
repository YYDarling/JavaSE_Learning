import Entities.LinkedStack;

public class Main {
    public static void main(String[] args) {

        //First in First Out
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("A");  //一次性同时操作： contorl + 鼠标拖
        stack.push("A");
        stack.push("A");
        stack.push("A");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}