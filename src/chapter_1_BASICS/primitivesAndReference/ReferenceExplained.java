//9
package chapter_1_BASICS.primitivesAndReference;

public class ReferenceExplained {
    // A reference can be assigned to another object of the same or compatible type
    String greeting = "Hello!";

    // A reference can be assigned a new object using the "new" keyword
    String question = new String("How are you?");

}
/*      We placed a code snippet here that would not compile because it would mess up our workflow

    String reference = "hello";
    int len = reference.length();
    int bad = len.length();

        The code is good until the last .length() method being used ON AN INT
        PRIMITIVES HAVE NO METHODS!!!! so it does not compile

        Oh yeah btw, primitives CANNOT be declared as null. See this?

    int value = null;

        yeah... it does not compile. Use Integer instead omg
 */

/*
Stack (method memory)
 ┌────────────────────────────┐
 │ greeting ───────────────┐  │
 └────────────────────────────┘
                            │
                            │
Heap (object memory)        ▼
 ┌────────────────────────────────┐
 │  String object: "How are you?" │
 └────────────────────────────────┘
 */

// Up next: StringToInt.java