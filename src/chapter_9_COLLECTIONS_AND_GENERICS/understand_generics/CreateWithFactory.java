package chapter_9_COLLECTIONS_AND_GENERICS.understand_generics;

import java.util.*;

public class CreateWithFactory {
    static void main() {

        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array); // [a, b, c]
        List<String> of = List.of(array);           // [a, b, c]
        List<String> copy = List.copyOf(asList);    // [a, b, c]

        array[0] = "z";

        System.out.println(asList);                 // [z, b, c]
        System.out.println(of);                     // [a, b, c]
        System.out.println(copy);                   // [a, b, c]

        asList.set(0, "x");
        System.out.println(Arrays.toString(array)); // [x, b, c]
    }
}
