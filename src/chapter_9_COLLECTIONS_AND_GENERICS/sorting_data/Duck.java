package chapter_9_COLLECTIONS_AND_GENERICS.sorting_data;

public record Duck(String name) implements Comparable<Duck> {
    public int compareTo(Duck d) {
        return name.compareTo(d.name);  // Sorts ascendingly by name
    }
}
