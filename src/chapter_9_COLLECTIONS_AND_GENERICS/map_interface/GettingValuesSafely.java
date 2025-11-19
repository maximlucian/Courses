package chapter_9_COLLECTIONS_AND_GENERICS.map_interface;

import java.util.*;

public class GettingValuesSafely {
    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<>();
        map.put('x', "spot");
        System.out.println("X marks the " + map.get('x'));
        System.out.println("X marks the " + map.getOrDefault('x', ""));
        System.out.println("Y marks the " + map.get('y'));
        System.out.println("Y marks the " + map.getOrDefault('y', ""));
    }
}
