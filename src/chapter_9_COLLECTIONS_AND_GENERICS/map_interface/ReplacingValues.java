package chapter_9_COLLECTIONS_AND_GENERICS.map_interface;

import java.util.*;

public class ReplacingValues {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 4);
        Integer original = map.replace(2, 10); // 4
        System.out.println(map);    // {1=2, 2=10}
        map.replaceAll((k, v) -> k + v);
        System.out.println(map);    // {1=3, 2=12}
    }
}
