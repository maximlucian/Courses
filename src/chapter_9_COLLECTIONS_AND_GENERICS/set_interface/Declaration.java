package chapter_9_COLLECTIONS_AND_GENERICS.set_interface;

import java.util.Set;

public class Declaration {
    Set<Character> letters = Set.of('c', 'a', 't');     //you can simply declare an immutable Set like you do with a list
    Set<Character> copy = Set.copyOf(letters);      //or also make a copy of another Set
}
