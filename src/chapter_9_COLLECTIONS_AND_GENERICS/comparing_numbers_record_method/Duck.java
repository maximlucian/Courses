package chapter_9_COLLECTIONS_AND_GENERICS.comparing_numbers_record_method;

public record Duck(String name, int weight) implements Comparable<Duck> {
    public int compareTo(Duck d) {
        return name.compareTo(d.name);              //here we are comparing the data with compareTo()
    }
    public String toString() { return name; }
}
