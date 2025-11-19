//19
package chapter_1_BASICS.garbage;

public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a"); //we have "one" referencing the object with value "a"
        two = new String("b"); //we have "two" referencing the object with value "b"
        one = two; //now "one" points to "b" as well, so the object with the value "a" is OUT OF SCOPE
//                                                                                  thus eligible for garbage collection
        String three = one;
        one = null;
        //at the end of the program, "b" also goes out of scope and is eligible for garbage collection
    }
}

// THE END