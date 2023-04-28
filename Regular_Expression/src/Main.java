public class Main {
    public static void main(String[] args) {

        //String str = "aaaa731341@163.com";
        //假设邮箱格式为 数字/字母@数字/字母.com

        String str = "oooo";
        //matches方法用于对给定正则表达式进行匹配，匹配成功返回true，否则返回false
        System.out.println(str.matches("o+"));   //+表示对前面这个字符匹配一次或多次，这里字符串是oooo，正好可以匹配
        //return true
        System.out.println(str.matches("o{3}")); //出现三次

    }
}