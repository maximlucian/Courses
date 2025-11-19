package chapter_9_COLLECTIONS_AND_GENERICS.sorting_data;

import java.util.ArrayList;

public abstract class Main extends ArrayList<Duck> implements Comparable<Duck> {
    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new
                Duck("Quack"));
        ducks.add(new
                Duck("Puddles"));
//        Collections.sort(ducks);
        System.out.print(ducks);  // this will print out [Duck[name=Puddles], Duck[name=Quack]]
    }
}