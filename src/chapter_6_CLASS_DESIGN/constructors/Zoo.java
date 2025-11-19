package chapter_6_CLASS_DESIGN.constructors;

public class Zoo {
//    public Zoo() {
//        System.out.println("Zoo created");
//        super();     // doesn't compile because super() -> the call to the parent class - should be the first statement in a constructor
//    }

    public Zoo() {
        super();
        System.out.println("Zoo created");
//        super();      //first, we have to have super() only on the first line of the constructor
    }               //second, we cannot call it twice
}
