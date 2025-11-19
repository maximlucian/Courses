package chapter_6_CLASS_DESIGN.constructors;

public class Gorilian {
    private int age;
    private String name;
    public Gorilian(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public Gorilian(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}