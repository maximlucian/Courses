package chapter__10_STREAMS;

import java.util.Optional;
import java.util.stream.Stream;

public class MinMax {
    //these two methods pass a custom comparator to find the min or max in a Stream
    //both are reductions because they return a single value after looking at the
    //entire Strea,

//    Signatures: public Optional<T> min/max(Comparator< ? super T> comparator)

    public static void main() {
        Stream<String> s = Stream.of("monkey", "JJ", "Deji");

        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);   //JJ

        //you can notice that in this case we use an Optional for returning the result
        //thanks to this we can use the ifPresent method so we print a minimum/maximum
        //only if one is found

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent());  //this will give out "false"
    //since the Stream is empty, the comparator is never called, and no value is
        //present in the Optional (the minEmpty used to output the minimal value)
    }
}
