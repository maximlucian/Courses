package chapter_9_COLLECTIONS_AND_GENERICS.comparing_numbers_record_method;

public record ZooDuck(int id, String name) implements Comparable<ZooDuck> {
    public int compareTo(ZooDuck d) {
        return id - d.id;                // Sorts by id
    }
}
