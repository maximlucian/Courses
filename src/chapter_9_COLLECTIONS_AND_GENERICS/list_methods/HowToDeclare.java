package chapter_9_COLLECTIONS_AND_GENERICS.list_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowToDeclare {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("SD");                     // [SD]
            list.add(0, "NY");    // [NY,SD]

            list.set(1, "FL");                  // [NY,FL]

            System.out.println(list.get(0));    // NY

            list.remove("NY");               // [FL]
            list.remove(0);               // []

            list.set(0, "?");                   // IndexOutOfBoundsException

            var numbers = Arrays.asList(1, 2, 3);
            numbers.replaceAll(x -> x*2);       //inmultim totul cu 2
            System.out.println(numbers);   // [2, 4, 6]
        }
}
