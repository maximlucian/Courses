package chapter_10_STREAMS;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//we have the collectors we talked about earlier, but Java provides us
//simpler ways to use them, as now they are integrated in Java
public class CollectingWasAddedToJava {
    public static void main() {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set =
                stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); //[f, l, o, w]

        //this is the simplified version for what we saw earlier

        //or even shorter, if we do not need the set to be sorted:

        Stream<String> streamNotSorted = Stream.of("w", "o", "l", "f");

        Set<String> setNotSorted = stream.collect(Collectors.toSet());
    }
}
