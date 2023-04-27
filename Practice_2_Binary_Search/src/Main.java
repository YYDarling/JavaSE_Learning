public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        int target = 3;
        System.out.println(binarySearch(nums, target));
    }

    public static int binarySearch(int[] nums, int target){

        int left = 0, right = nums.length - 1;
        while (left <= right){   //小于等于
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }

    //递归的写法
    //if (left > right) return -1;

}