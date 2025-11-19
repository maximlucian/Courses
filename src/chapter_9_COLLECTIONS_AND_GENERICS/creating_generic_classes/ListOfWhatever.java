package chapter_9_COLLECTIONS_AND_GENERICS.creating_generic_classes;

import java.util.ArrayList;
import java.util.List;

public class ListOfWhatever {

    public static void printList(List<?> list) {        //we use this because we cannot use "Object" as a parameter
        for (Object x: list)                    //for string, so we just use the generic ? parameter, like, "whatever"
            System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);
    }
}
