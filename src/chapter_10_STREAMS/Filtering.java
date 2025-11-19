package chapter_10_STREAMS;

//method signature for filtering: public Stream<T> filter(Predicate<? super T> predicate)

import java.util.stream.Stream;

public class Filtering {
    public static void main() {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::print);

        //Removing duplicates

        Stream<String> sDistinct = Stream.of("Duck", "Duck", "Duck", "Goose");
        s.distinct()
                .forEach(System.out::print);

        //Limiting by Position

        Stream<Integer> sLimitAndSkip = Stream.iterate(1, n -> n + 1);
        s.skip(5)
                .limit(2)
                .forEach(System.out::print);

        //Mapping - the map() method creates a one-to-one mapping from
        // the elements in the stream to the elements of the next step
        // in the stream

        //it uses the lambda expression to figure out the type passed to that
        //function and the one returned

        //the "map()" method on streams is for transforming data

        Stream<String> sMapped = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length)   //String::length is the short for the lambda x -> x.length()
                .forEach(System.out::print);        //which clearly shows it turns a String to an Integer
    }
}
