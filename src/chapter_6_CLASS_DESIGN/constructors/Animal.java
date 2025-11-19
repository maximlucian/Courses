package chapter_6_CLASS_DESIGN.constructors;

public class Animal {
    private int age;

    public Animal(int age) {
        super();     // Refers to constructor in java.lang.Object
        this.age = age;
    }
}
