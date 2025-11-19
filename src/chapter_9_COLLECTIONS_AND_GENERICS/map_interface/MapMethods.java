package chapter_9_COLLECTIONS_AND_GENERICS.map_interface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    static void addElementsAndPrint(Map<String, String> map) {
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key: map.keySet())
            System.out.print(key + ",");


        System.out.println(map.containsKey("lion"));    // true
        System.out.println(map.containsValue("lion"));  // false
        System.out.println(map.size());                 // 3
        map.clear();
        System.out.println(map.size());                 // 0
        System.out.println(map.isEmpty());              // true
    }                   //the contains() method is in the Collections interface, but not in the Map interface

    public static void main(String[] args) {
        addElementsAndPrint(new HashMap<>());        // koala,giraffe,lion,
        addElementsAndPrint(new LinkedHashMap<>());  // koala,lion,giraffe,
        addElementsAndPrint(new TreeMap<>());        // giraffe,koala,lion,
    }
}
