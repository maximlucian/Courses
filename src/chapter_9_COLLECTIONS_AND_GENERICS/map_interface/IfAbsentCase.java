package chapter_9_COLLECTIONS_AND_GENERICS.map_interface;

import java.util.*;

public class IfAbsentCase {
    public static void main(String[] args) {
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // the output will be {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
    }
}
