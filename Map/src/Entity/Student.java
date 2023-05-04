package Entity;

/**
 * @title: Student
 * @Auther: Yun
 * @Date: 5/4/23 01:12
 * @Version 1.0
 */

public class Student {
    private final String name;
    private final String type;
    private final int score;

    public Student(String name, String type, int score) {
        this.name = name;
        this.type = type;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getType() {
        return type;
    }
}
