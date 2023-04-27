import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //数组工具类在until包之下，便捷操作数组， 比如想要直接打印数组， 可以直接通过toString 方法转换字符串
        int[] arr = new int[]{2, 1, 4, 3, 5, 6};

        //Arrays打印数组
        System.out.println(Arrays.toString(arr));

        //Arrays排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //数组填充
        int[] arr_2 = new int[10];
        Arrays.fill(arr_2, 10);  //[10, 10, 10, 10, 10, 10, 10, 10, 10, 10]
        System.out.println(Arrays.toString(arr_2));

        //数组copy
        int[] target = Arrays.copyOf(arr, 5);
        int[] target_2 = Arrays.copyOfRange(arr, 3, 5);
        System.out.println(Arrays.toString(target));   //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(target_2));

        //将一个数组拷贝到另外一个数组
        int[] arr_3 = new int[]{2, 1, 43 , 5, 55};
        int[] target_3 = new int[10];
        System.arraycopy(arr_3, 0, target_3, 1, 3);  //5个参数， 从零开始复制， 从哪里开始放， 长度
        System.out.println(Arrays.toString(target_3));

        //二分搜索, 数组一定要有序
        Arrays.sort(arr_3);
        System.out.println(Arrays.binarySearch(arr_3, 1));

        //打印二维数组
        int[][] array = new int[][]{{2, 8, 4, 1}, {9, 2, 0, 3}};
        System.out.println("2D-Array : " + Arrays.toString(array));
        System.out.println("2D-Array : " + Arrays.deepToString(array));  //deeptoString for multi- arr

        //判断两个数组内容是否一致
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,4};
        System.out.println(a.equals(b));   //flase ,因为两个是不同的对象
        System.out.println(Arrays.equals(a, b));  //判断两个数组内容是否一致

        //判断多维数组是否是一致 deepequals
        int[][] c = new int[][]{{2, 8, 4, 1}, {9, 2, 0, 3}};
        int[][] d = new int[][]{{2, 8, 4, 1}, {9, 2, 0, 3}};
        System.out.println(Arrays.equals(c, d));   //equals仅适用于一维数组
        System.out.println(Arrays.deepEquals(c, d));   //对于多维数组，需要使用deepEquals来进行深层次判断






    }
}