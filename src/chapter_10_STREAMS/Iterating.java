package chapter_10_STREAMS;

import java.util.stream.Stream;

public class Iterating {
    public static void main() {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print);

        //remember that you can call "forEach()" directly on a Collection or
        //on a Stream -- they are BOTH VALID
        // and FYI  ---> You CANNOT use a traditional for / for each loop on a Stream
    }
}
