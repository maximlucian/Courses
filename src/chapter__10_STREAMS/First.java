package chapter__10_STREAMS;

import java.util.List;
import java.util.stream.Stream;

public class First {
    Stream<String> empty = Stream.empty();
    Stream<Integer> one = Stream.of(1);
    Stream<Integer> fromArray = Stream.of(1, 2, 3);

    public static void main() {

        //we can also convert a Collection to a Stream
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();

        //also, if we want to, we can create a parallel Stream

        Stream<String> fromListParallel = list.parallelStream();

        //and yeah, we can create infinite Streams (this is only cool
                    //because we cannot create an infinite list for example)
        Stream<Double> randoms = Stream.generate(Math::random); //this creates how many numbers we want but remember, the source
                                    //doesn't actually create the values until you call a terminal operation
                                    //we can use operations like "limit()" to turn
                                    //these into finite operations

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
                                                        //here we have a simple lambda
                                            //the iterate() method takes a seed or "starting value"
                                   // and after that the second parameter is a lambda expression

        Stream<Integer> oddNumbersUnder100 = Stream.iterate(
          1,                //this is the seed, or the starting point
          n -> n < 100,     //Predicating to specify when done
          n -> n + 2);      // UndaryOpreator used to get the next value, which in this case, is a formula

    }
}