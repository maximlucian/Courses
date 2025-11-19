package chapter__10_STREAMS;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce {
    //The reduce() method combines a Stream into a single Stream Object
    // IT "REDUCES" it to a String

    public static void main() {
        //if we take the classical concatenation approach, it would look smth like:
        var array = new String[] { "w", "o", "l", "f" };
        var result = "";
        for (var s: array) result = result + s;
        System.out.println(result); // wolf

        //but we want LAMBDASSSS!!!
        //look at what's next, really useful istg

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word);  //wolf

        //but we can further extend the usage of the reduce() method
        //we can use it for combining almost anything:

        Stream<Integer> numbers = Stream.of(3, 5, 6);
        System.out.println(numbers.reduce(1, (a, b) -> a*b));
                // we have 3 options for cases of Stream elements:
                //        -->   If the stream is empty, an empty Optional is returned.
                //        -->   If the stream has one element, it is returned.
                //        -->   If the stream has multiple elements, the accumulator is applied to combine them.
        //IDENTITY IS OPTIONAL BUT RECOMMENDED

        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println);         // no output
        oneElement.reduce(op).ifPresent(System.out::println);    // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90

        //Now we look at when we want to use different types

        Stream<String> differentTypes = Stream.of("w", "o", "l", "f!");
        int length = stream.reduce(0,
                (i, s) -> i+s.length(), (a, b) -> a+b);
    }
}
