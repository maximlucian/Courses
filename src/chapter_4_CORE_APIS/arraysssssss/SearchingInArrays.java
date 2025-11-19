package chapter_4_CORE_APIS.arraysssssss;

import java.util.Arrays;

public class SearchingInArrays {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 9};
        int[] numbersUnorganized = {5, 3, 9, 7};

        System.out.print(Arrays.binarySearch(numbers, 2));  //this wil print out -1 because it presents the spot 2 should be in -1

        System.out.println(Arrays.binarySearch(numbers, 4)); //this will print out -2 because that is where it should be
                                                                        //(prints out '-' and the negative position it should be in -1)
        System.out.println(Arrays.binarySearch(numbersUnorganized, 6)); //this will give out an incorrect answer because
                                                                // THE ARRAY HAS TO BE ORGANIZED FOR BINARY SEARCH TO WORK PROPERLY
    }
}
