public class Main {
//    public static void main(String[] args) {
//        Thread t = new Thread(() -> { // lambda 表达式
//            System.out.println("我是线程："+Thread.currentThread().getName());
//            System.out.println("我正在计算 0-10000 之间所有数的和...");
//            int sum = 0;
//            for (int i = 0; i <= 10000; i++) {
//                sum += i;
//            }
//            System.out.println("结果："+sum);
//        });
//        t.start(); // 启动线程
//        System.out.println("我是主线程！"); //先运行主线程
//    }
public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
        for (int i = 0; i < 50; i++) {
            System.out.println("我是一号线程："+i);
        }
    });
    Thread t2 = new Thread(() -> {
        for (int i = 0; i < 50; i++) {
            System.out.println("我是二号线程："+i);
        }
    });
    t1.start(); // 启动线程 可以试试start和run的区别, run是直接调用run方法，不会启动线程, 会按顺序执行
    t2.start();
}
}