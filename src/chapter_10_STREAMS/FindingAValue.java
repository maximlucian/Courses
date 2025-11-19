package chapter_10_STREAMS;

import java.util.stream.Stream;

public class FindingAValue {
    //we use findAny() or findFirst() to return an element of the stream unless
    //the Stream is empty, in which case they return an empty Optional
    //(first method we have seen that can terminate with an infinite Stream)

    //these are TERMINAL OPERATIONS BUT NOT REDUCTIONS

//    Signatures: public Optional<T> findAny() \  findFirst()

    public static void main() {

        Stream<String> s = Stream.of("monkey", "gorilla","bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);     //money(in most cases)
        infinite.findAny().ifPresent(System.out::println);  //chimp
    }
}
