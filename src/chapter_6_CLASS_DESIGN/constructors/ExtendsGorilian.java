package chapter_6_CLASS_DESIGN.constructors;

public class ExtendsGorilian extends Gorilian {
    public ExtendsGorilian(int age) {
        super(age, "ExtendsGorilian");      //because the Gorilian class has 2 constructors, is is ok to have these 2 guys here
    }
    public ExtendsGorilian() {
        super(5);
    }
}
