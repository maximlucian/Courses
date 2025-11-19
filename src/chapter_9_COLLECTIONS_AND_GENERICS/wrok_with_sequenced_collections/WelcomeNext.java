package chapter_9_COLLECTIONS_AND_GENERICS.wrok_with_sequenced_collections;

import java.util.*;
import java.util.SequencedCollection;

public class WelcomeNext {
public static void welcomeNext(SequencedCollection<String> visitors) {
    System.out.println("Welcome to the Zoo! " + visitors.getFirst());
    visitors.removeFirst();

    //We also have the following:
//
//    visitors.removeLast();
//    visitors.getLast();
//    visitors.addFirst(E e);
//    visitors.addLast(E e);
}

    public static void moveToEnd(SequencedCollection<String> visitors) {
        visitors.addLast(visitors.removeFirst());
    }

    public static void main(String[] args) {
    //An ArrayList is a squenced Collection !!!!
        var visitArrayList = new ArrayList<String>(List.of("Huey", "Dewey", "Louie"));
        var visitLinkedList = new LinkedList<String>(List.of("Moe", "Larry", "Shemp"));
        var visitTreeSet = new TreeSet<String>(Set.of("Alvin", "Simon", "Theodore"));

        welcomeNext(visitArrayList);  // Welcome to the Zoo! Huey
        welcomeNext(visitLinkedList); // Welcome to the Zoo! Moe
        welcomeNext(visitTreeSet);    // Welcome to the Zoo! Alvin

        //here we remove the first and then we output the remaining with "moveToNext"

        var visitLastArrayList = new ArrayList<String>(
                List.of("Bluey", "Bingo", "Socks"));
        var visitLastLinkedList = new LinkedList<String>(List.of("Garfield", "Odie"));
        var visitLastTreeSet = new TreeSet<String>(Set.of("Tom", "Jerry"));

        moveToEnd(visitLastArrayList);
        welcomeNext(visitLastArrayList);  // Welcome to the Zoo! Bingo

        moveToEnd(visitLastLinkedList);
        welcomeNext(visitLastLinkedList); // Welcome to the Zoo! Odie

        moveToEnd(visitLastTreeSet);      // java.lang.UnsupportedOperationException
        welcomeNext(visitLastTreeSet);  // you cannot insert an item at the end of a sorted structure
    }
}