import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String str = scanner.nextLine();
        //int it = scanner.nextInt();  //also accept Int
        //char[] chars = str.toCharArray();
        //System.out.println("The User Input : " + chars);
        System.out.println(palindrome());

        }


    //ABCBA 回文
    private static boolean palindrome(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();

        //双指针
        int left = 0, right = chars.length - 1;
        while (left < right){
            if (chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}