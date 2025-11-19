package chapter_9_COLLECTIONS_AND_GENERICS.understand_generics;

import java.util.*;

public class CreateWithConstructor {
    static void main() {
        var linked1 = new LinkedList<String>();
        var linked2 = new LinkedList<String>(linked1);

        //    There are 3 methods you can use to create a list
        var list1 = new ArrayList<String>();        //no size or value
        var list2 = new ArrayList<String>(list1);   //value
        var list3 = new ArrayList<String>(10);  //only size
    }
}
