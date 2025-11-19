package chapter_9_COLLECTIONS_AND_GENERICS.understand_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class AddDataToList {

    public static void main() {

        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow"));
        System.out.println(list.add("Sparrow"));

        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));     //this will not be doable because we cannot have duplicates in a Set

        Collection<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal"));
        System.out.println(birds.remove("hawk"));
        System.out.println(birds);
    }
}
