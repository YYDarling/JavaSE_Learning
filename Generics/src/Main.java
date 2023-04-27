public class Main {
    public static void main(String[] args) {

        //泛型其实就一个待定类型，我们可以使用一个特殊的名字表示泛型，泛型在定义时并不明确是什么类型，而是需要到使用时才会确定对应的泛型类型。


        //1. Generics Class
        //Score<String, String>score = new Score<>("数据结构与算法基础", "EP074512", "优秀");  //是String类型的
        //Entity.Score<Integer> score = new Entity.Score("数据结构与算法基础", "EP074512", 90); //是int类型
        //Integer number = (Integer) score.getValue();  //获取成绩需要进行强制类型转换，虽然并不是一开始的类型，但是编译不会报错


        //2. Generics && Polymorphism

        //}

        //static class A implements Test<String> {
        //继承的时候需要明确方法类型 ex : string, integer
        //也可以继续定义为一个generic class : static class A<E> implements Test<E>

        //@Override
        //public String test() { //这里明确了类型了 是string
        //    return null;
        //}

        //3.Generics && Methods
        //String str = test("yundu"); //自动明确类型

        //泛型方法排序：Arrays --> Comparator神器
        //Integer[] arr = {1, 4, 5, 2, 6, 3, 0, 7, 9, 8}; //只能为Integer类型， 不能改为int 类型
        //Arrays.sort(arr, new Comparator<Integer>() {
        //    @Override
        //    public int compare(Integer o1, Integer o2) {
        //        return o2 - o1;
        //正序： o1 - o2
        //    }
        //});

        //直接替换为lamda表达式
        //Arrays.sort(arr, (o1, o2) -> o2 - o1);
        //System.out.println(Arrays.toString(arr));

        //数组的复制
        //String[] arr = {"AAA", "BBB", "CCC"};
        //String[] newArr = Arrays.copyOf(arr, 3);   //这里传入的类型是什么，返回的类型就是什么，也是用到了泛型
        //System.out.println(Arrays.toString(newArr));

        //4.泛型的界限： 可以给他设定一个界限，Ex： 不希望用户将泛型指定为除数字类型外的其他类型
        //Score<? extends Number> score = new Score<Double>("", "", 10.0); //上界； extend : 子类
        //Score<? super Number> score_2 = new Score<Number>("", "" , 10); //下届; super ； father , 最低是自己

        //5.类型擦除机制

    }

    //static class B extends A<String>{}



//    public static <T>T test(T t){
//        // This is a generic Methods
//        return t;
//    }




}