public class Main {
    public static void main(String[] args) {
        hanoi('A', 'B', 'C', 3);

    }

    //将N片圆盘从A移动到C
    static void hanoi(char a, char b, char c, int n){
        //n 表示有多少片
        //a, b, c 表示有几个圆盘
        if (n == 1){
            System.out.println(a + " ---> " + c);
        } else{
            //目标从a 移动到 b 上
            hanoi(a, c, b, n -1);
            System.out.println(a + " ---> " + c);
            hanoi(b, a, c, n-1);
        }

    }
}