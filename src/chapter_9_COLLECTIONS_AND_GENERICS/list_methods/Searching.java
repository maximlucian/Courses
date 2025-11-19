package chapter_9_COLLECTIONS_AND_GENERICS.list_methods;

import java.util.List;

public class Searching {
    public static void main(String[] args) {

        var list = List.of("peacock", "chicken", "peacock", "turkey");

        System.out.println(list.indexOf("peacock"));         // 0
        System.out.println(list.lastIndexOf("peacock"));  // 2
        System.out.println(list.indexOf("penguin"));         // -1
    }
}
