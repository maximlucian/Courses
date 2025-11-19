package chapter_9_COLLECTIONS_AND_GENERICS.comparing_multiple_fields;

import java.util.Comparator;

public class MultiFieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.species().compareTo(s2.species());
        if (result != 0) return result;
        else return s1.weight() - s2.weight();
    }
}