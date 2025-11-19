package chapter_4_CORE_APIS.arraysssssss;

import java.util.Arrays;

public class CompareAndMismatch {
    public static void main(String[] args) {
        int numbers[] = {12, 13, 14, 15};
        int sameNumbers[] = {12, 13, 14, 15};

        int[] differentOrder = {15, 12, 11, 15};

        int smallerSize[] = {12, 13};
        int biggerSize[] = {12, 13, 14, 15, 16, 17};
                    //compare compara fiecare element cu perechea lui. daca numbers[1] < differentOrder[1] => numar negativ si invers (+-1)
        System.out.println(Arrays.compare(numbers, sameNumbers));   //equal results in 0

        System.out.println(Arrays.compare(numbers, smallerSize));   //numbers is bigger will result in a positive number (how many extra elements)
        System.out.println(Arrays.compare(numbers, biggerSize));    //numbers is smaller - results in a negative number (how many elements less)

        System.out.println(Arrays.compare(numbers, differentOrder));//different order results in either a negative or positive number
/*
                ->  null is smaller than any other value.
                ->  For numbers, normal numeric order applies.
                ->  For Strings, one is smaller if it is a prefix of another.
                ->  For Strings/characters, numbers are smaller than letters.
                ->  For Strings/characters, uppercase is smaller than lowercase.
 */

        // now getting to mismatch()

        System.out.println(Arrays.mismatch(numbers, sameNumbers));
        System.out.println(Arrays.mismatch(numbers, smallerSize));
        System.out.println(Arrays.mismatch(numbers, differentOrder));
        System.out.println(Arrays.mismatch(numbers, biggerSize));

    }
}
