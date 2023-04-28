public class Main {
    public static void main(String[] args) {

//        String str1 = "你看";
//        String str2 = "这";
//        String str3 = "汉堡";
//        String str4 = "做滴";
//        String str5 = "行不行";
//        StringBuilder builder = new StringBuilder();
//        builder.append(str1).append(str2).append(str3).append(str4).append(str5);
//        System.out.println(builder.toString());
        //这里创建了一个StringBuilder的类型，
        //我们可以使用它来对字符串进行拼接、裁剪等操作，
        //它就像一个字符串编辑器，弥补了字符串不能修改的不足：

        //ex:
        //拼接
        StringBuilder builder = new StringBuilder();   //一开始创建时，内部什么都没有
        builder
                .append("AAA")   //我们可以使用append方法来讲字符串拼接到后面
                .append("BBB");  //链式调用
        System.out.println(builder.toString());   //当我们字符串编辑完成之后，就可以使用toString转换为字符串了

        //裁剪
        builder.delete(0,3);
        System.out.println(builder.toString());

        //替换
        builder.replace(0,3,"CCA");
        System.out.println(builder.toString());

        //反转
        builder.reverse();
        System.out.println(builder.toString());



    }
}