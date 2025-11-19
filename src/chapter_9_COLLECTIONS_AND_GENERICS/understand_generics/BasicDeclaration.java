package chapter_9_COLLECTIONS_AND_GENERICS.understand_generics;

import java.util.*;

public class BasicDeclaration {

    public static void main(String[] args) {


//    List numbers = new ArrayList(List.of(1,2,3));
//    Integer element = (Integer)numbers.get(0);  // Required cast to compile
//numbers.add("Welcome to the zoo!");         // Unrelated types allowed <----(compare here)
//                                                                                  |
    //comparing this to the following, you would see why generics are better        |
//                                                                                  |
    List<Integer> numbers = new ArrayList<Integer>(List.of(1,2,3));             //  |
    Integer element = numbers.get(0);    // No cast required                        |
//    numbers.add("Welcome to the zoo!");  // But here, unrelated types are not allowed (this will not compile)


        List<Integer> list = new ArrayList<Integer>();
//        we can shorten the declaration from above to what we see below
        List<Integer> listBetter = new ArrayList<>();

        Map<Long,List<Integer>> mapOfLists = new HashMap<Long,List<Integer>>();
//          same goes here (We are using the DIAMONG OPERATOR)
        Map<Long,List<Integer>> mapOfListsBetter = new HashMap<>();


//        we can also apply var to make it even shorter
        var listVar = new ArrayList<Integer>();
        var mapOfListsVar = new HashMap<Long,List<Integer>>();
    }
}
