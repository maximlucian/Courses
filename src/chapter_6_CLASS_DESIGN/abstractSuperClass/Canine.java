package chapter_6_CLASS_DESIGN.abstractSuperClass;

public abstract class Canine {                  //the idea is that developers can create and modify subclasses of type Canine
    public abstract String getSound();                  //but THIS Class remains unchanged
    public void bark() { System.out.println(getSound()); }
}
