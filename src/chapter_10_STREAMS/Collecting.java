package chapter_10_STREAMS;

import java.util.TreeSet;
import java.util.stream.Stream;

public class Collecting {
    // special reduction called a mutable reduction
    //it is more efficient than a regular reduction because we use the same mutable object,
//  wihle accumulating

/*          Method Signature

           public <R> R collect(Supplier<R> supplier,       #1
                BiConsumer<R, ? super T> accumulator,
                BiConsumer<R, R> combiner)

                Public <R,A> R collect(Collector<? super T, A, R> collector)  #2
 */


    public static void main() {
        //we will start with the signature #1
        Stream<String> stream = Stream.of("w", "o", "l", "f");

        StringBuilder word = stream.collect(
                StringBuilder::new, //supplier, which creates the object (will collect data) ->no parameter, returns a value
                StringBuilder::append,  //accumulator, which is a BiConsumer that takes two parameters
                StringBuilder::append); //combiner(Biconsumer - takes two data collections and merges them)                       //and returns nothing

        System.out.println(word);  //wolf

        //we will have an example where the logic is different in the accumulator and combiner

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");

        TreeSet<String> set = stream.collect(
                TreeSet::new,       //supplier
                TreeSet::add,       //accumulator
                TreeSet::addAll);   //combiner

        System.out.println(set);    //[f, l, o, w]
    }

}
