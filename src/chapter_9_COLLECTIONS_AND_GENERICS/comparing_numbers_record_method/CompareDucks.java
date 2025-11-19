package chapter_9_COLLECTIONS_AND_GENERICS.comparing_numbers_record_method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareDucks {
    public static void main(String[] args) {
//        Comparator<Duck> byWeight = new Comparator<>() {
//            public int compare(Duck d1, Duck d2) {
//                return d1.weight() - d2.weight();
//            }
//        };

        Comparator<Duck> byWeight = (d1, d2) -> d1.weight()-d2.weight();    //this lambda expression replaces all
        var ducks = new ArrayList<Duck>();          //the code on lines 9 to 13, due to the fact
        ducks.add(new Duck("Quack", 7));    //Comparator is a functional interface (one abstract method in it)
        ducks.add(new Duck("Puddles", 10));
                                                        //FYI Comparable is also an abstract interface (you can use lambda!!!)

        Collections.sort(ducks);
        System.out.println(ducks);           // [Puddles, Quack]
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);           // [Quack, Puddles]
    }
}
