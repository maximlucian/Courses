package chapter_9_COLLECTIONS_AND_GENERICS.comparing_numbers_record_method;

public record LegacyDuck(String name) implements Comparable {   //dealing with legacy code or code that does not use generics,
    public int compareTo(Object obj) {                      // the compareTo() method requires a cast since it is passed an Object
        if (obj instanceof LegacyDuck d)
            return name.compareTo(d.name);
        throw new UnsupportedOperationException("Not a duck");
    }
}
