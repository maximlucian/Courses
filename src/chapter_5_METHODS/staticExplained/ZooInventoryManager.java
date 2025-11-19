package chapter_5_METHODS.staticExplained;

import java.util.*;

public class ZooInventoryManager {
    private static final String[] treats = new String[10];

    public static void main(String[] args) {
        treats[0] = "popcorn";      //even though treats is final, it doesn't mean we cannot change its' contents. duuh
        System.out.println(Arrays.toString(treats));
    }
}