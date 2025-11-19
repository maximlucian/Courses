package chapter_9_COLLECTIONS_AND_GENERICS.creating_generic_classes;

public class Crate<T> {
    private T contents;

    public T lookInCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }
}
/*
->     E for an element
->     K for a map key
->     V for a map value
->     N for a number
->     T for a generic data type
->     S, U, V, and so forth for multiple generic types
 */
