package chapter__10_STREAMS;

import java.util.stream.Stream;

public class Counting {
    //if you want to count an infinite Stream you CANNOT - logic

    //signature: public long count()
    public static void main() {

    Stream<String> s = Stream.of("Monkey", "JJ", "Deji");
        System.out.println(s.count()); //this will print out 3, as there are 3 elements
    }
}
