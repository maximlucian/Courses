//1
package chapter_1_BASICS.coding_for_dummies;

public class Chick {

    //this is a constructor -- no return type -- same name as the class
    public Chick() {
        System.out.println("in constructor");
    }

    //this is not a constructor -- same name -- but it has the "void" return type
    //it will not be called when you write "new Chick()"
    public void Chick() {}
}


// this is the first one and we continue in "Chicken.java"