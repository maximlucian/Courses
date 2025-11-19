package chapter_10_STREAMS;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Matching {
    //here we use the methods: allMatch(), anyMatch(). noneMatch()
//    these ones are not reductions because THEY DO NOT LOOK AT ALL THE ELEMENTS
//    Signatures:

//    public boolean anyMatch(Predicate <? super T> predicate);
//    public boolean allMatch(Predicate <? super T> predicate);
//    public boolean noneMatch(Predicate <? super T> predicate);

    public static void main() {
        var list = List.of("mokey", "two", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));   //true
        System.out.println(list.stream().allMatch(pred));   //false
        System.out.println(list.stream().noneMatch(pred));  //false
        System.out.println(infinite.anyMatch(pred));        //ture

        //what happened above shows us that we can reuse the same Predicate
        //without the need to use a different Stream each time

        Stream<String> infiniteAgain = Stream.generate(() -> "chimp");
        Predicate<String> predAgain = x -> Character.isLetter(x.charAt(0));
        System.out.println(infiniteAgain.anyMatch(predAgain));
//        allMatch() needs to check every element
//        so it will run until we kill the program
    }
}
