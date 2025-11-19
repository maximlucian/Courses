package chapter_9_COLLECTIONS_AND_GENERICS.comparing_numbers_record_method;

public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public int hashCode() { return id; }
                                                //class checks equality with id and orders by name
    public boolean equals(Object obj) {                 //(we assume names may repeat)
        if (obj instanceof Product other)       //this means we could have many pairs of elements in which
            return this.id == other.id;         //compareTo() returns 0, but equals() returns false.
        return false;
    }

    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    } }
