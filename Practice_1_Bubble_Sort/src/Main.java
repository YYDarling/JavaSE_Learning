import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
        sort(nums);
        System.out.println(Arrays.toString(nums));

    }

        //冒泡排序：第一个和第二个进行交换， 如果第二个小于第一个就进行交换， 否则不交换。然后， 第二个和第三个进行比较， 同理一直比较下去。
        //第一次交换结束后， 会把最大的找出来放在最后面
        //第二次交换后， 会找出第二大的数

    public static void sort(int[] nums){
        //冒泡排序
        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            //优化，因为最后一轮没有必要， 所以 -1
            boolean flag = false;
            //如果本身没有发生任何的交换， 已经有序， 就没必要再排序
            for (int j = 0; j < l - i - 1; j++) {
                //因为是j 和 j + 1 进行比教， 所以要退一位， -1 ， 不然会越位
                if (nums[j+1] < nums[j]) { //后面一位的值小于当前位的值
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = true;   //表示发生了交换
                }
            }

            //如果第一次循环结束之后发现flag 是false ， 没有发生任何变化， 就说明已经排好序了，直接返回
            if(!flag) break;  //flag == flase
        }
    }
}