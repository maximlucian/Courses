package chapter_9_COLLECTIONS_AND_GENERICS.sorting_and_searching;

import java.util.*;

public class SortRabbit {
    static record Rabbit(int id) {
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(1));

        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;   //this lambda was passed to we can use the collections sort

//        Collections.sort(rabbits); this line will not compile until we pass a comparator to next to rabbit
        Collections.sort(rabbits, c);

        Collections.reverse(rabbits);   //if we want the reverse order we can use this right after sorting

        System.out.println(rabbits);  // this output is present only for the "sort" method without using the reverse one. [Rabbit[id=1], Rabbit[id=3]]
        // the real output after line 22 is this: [Rabbit[id=3], Rabbit[id=1]]

        //right under we have the binarySearch() method that requires a sorted list for the job to be done
        List<Integer> list = Arrays.asList(6, 9, 1, 8);
        Collections.sort(list); // [1, 6, 8, 9]         //here we sort it
        System.out.println(Collections.binarySearch(list, 6)); // 1         //here we use binary search
        System.out.println(Collections.binarySearch(list, 3)); // -2
    }
}
