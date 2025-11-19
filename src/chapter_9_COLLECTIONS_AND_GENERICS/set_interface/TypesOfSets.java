package chapter_9_COLLECTIONS_AND_GENERICS.set_interface;

import java.util.Set;
import java.util.HashSet;

public class TypesOfSets {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);  // you cannot add a duplicate
        boolean b4 = set.add(8);
        for (Integer value : set)
            System.out.print(value + ", ");  //the outcome will be 66, 8, 10, for a hashset, as the order is not kept
                                            //the outcome for a LinkedHashSet will be kept as the order in which the Integers were added
                                            //for a TreeSet, the elements come out in their natural order (sorted)
    }
}
