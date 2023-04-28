package Entity;

/**
 * @title: Entity.Score
 * @Auther: Yun
 * @Date: 4/27/23 14:20
 * @Version 1.0
 */

public class Score<T extends Number> { //限定了一个上界： 只能是Number 底下的类型
    String name;
    //U id;
    String id;
    T value;  //因为Object是所有类型的父类，因此既可以存放Integer也能存放String
    //T会根据使用时提供的类型自动变成对应类型
    //

    //泛型其实就一个待定类型，我们可以使用一个特殊的名字表示泛型，泛型在定义时并不明确是什么类型，而是需要到使用时才会确定对应的泛型类型。

    public Score(String name, String id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
        //<?> 表示通配符
        //static 不能使用静态generics, 非静态就可以
    }

    public Object getValue() {
        //一定是obejct 类型中的子类
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}