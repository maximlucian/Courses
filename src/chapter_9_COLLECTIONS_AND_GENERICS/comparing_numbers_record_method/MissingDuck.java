package chapter_9_COLLECTIONS_AND_GENERICS.comparing_numbers_record_method;

public record MissingDuck(String name) implements Comparable<MissingDuck> {
    public int compareTo(MissingDuck quack) {       //throws exception if a null MissingDuck object is passed
        if (quack == null)
            throw new IllegalArgumentException("Poorly formed duck!");
        if (this.name == null && quack.name == null)
            return 0;
        else if (this.name == null) return -1;
        else if (quack.name == null) return 1;
        else return name.compareTo(quack.name);
    } }
