import Entity.Study;

public class Main {
    public static void main(String[] args) {

        //Study study = (a,b) -> a+b;
        //Study study = (a,b) -> Integer.sum(a,b);
        //System.out.println(study.sum(1,2));

        //方法引用 : ::
        //方法引用其实本质上就相当于将其他方法的实现，直接作为接口中抽象方法的实现。任何方法都可以通过方法引用作为实现
        //Study study = Integer::sum;
        //System.out.println(study.sum(1,2));

        //方法引用其实本质上就相当于将其他方法的实现，直接作为接口中抽象方法的实现。任何方法都可以通过方法引用作为实现
        Main main = new Main();
        Study study = main::lbwnb;
        System.out.println(study.study());

    }

    public String lbwnb(){
        return "我扯淡的人生";
    }
}