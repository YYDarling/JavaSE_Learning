public class Main {
    public static void main(String[] args) {
        //现在一共有n个台阶，一只青蛙每次只能跳一阶或是两阶，那么一共有多少种跳到顶端的方案？
        //例如n=2，那么一共有两种方案，一次性跳两阶或是每次跳一阶。

        //dp
        //0 : 0  arr[0]
        //1 : 1   arr[1]
        //2 : 1 + 1 = 2
        //3 : 1 + (1 + 1) = 3
        //4 : (1 + 2) + (1 + 1) = 5
        //5 : (1 + 2 + 1 + 1) + (1 + 2)  = 8
        //6 : 5 + 8 = 13
        System.out.println(frogJump(5));
    }
    private static int frogJump(int n){
        int[] arr = new int[n + 1];
        //dp
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

        //递归的写法
//        if(n == 0 || n == 1) return 1;
//        return jump(n - 1) + jump(n - 2);
}