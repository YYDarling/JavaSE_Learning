import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(Collections.max(list));
        System.out.println("________________________");

        //二分搜索
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 4, 5, 2, 9, 0));
        Collections.sort(list2);
        System.out.println(Collections.binarySearch(list2, 4));

        //找位置
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(Collections.indexOfSubList(list3, Arrays.asList(1, 2, 3)));
        System.out.println(Collections.lastIndexOfSubList(list3, Arrays.asList(1, 2, 3)));

        



    }
}