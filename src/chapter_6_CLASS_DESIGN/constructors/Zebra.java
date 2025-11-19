package chapter_6_CLASS_DESIGN.constructors;

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);  // Refers to constructor in Animal
    }

    public Zebra() {
        this(4);     // Refers to constructor in Zebra with int argument
    }
}
