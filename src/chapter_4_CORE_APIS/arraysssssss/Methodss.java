package chapter_4_CORE_APIS.arraysssssss;

import java.util.Arrays;

public class Methodss {
    public static void main(String[] args) {
        String[] bug = {"beetle", "butterfly", "ladybug"};
        String[] alias = bug;
        String[] otherBug = {"beetle", "butterfly", "ladybug"};
        String[] moreBugs = {"beetle", "butterfly", "ladybug", "ant"};

        System.out.println(bug.equals(alias));      // true because they have the same reference
        System.out.println(bug.equals(otherBug));   //false because they do not have the same reference
                                                //the equals() method does not check for the contents of an Array (it checks reference)
        System.out.println(bug.toString());     //this will give out the HashCode of the contents of the Array
                            //the method provided specifically so that we can print Arrays nicely is the following
        System.out.println(Arrays.toString(bug));
                        //below is the proper way to compare 2 arrays
        System.out.println(Arrays.equals(bug, otherBug));   //checks if the arrays have the same size, the same elements, in the same order
        System.out.println(Arrays.equals(bug, moreBugs));      //false (3 elements are the same, in the same order, but moreBugs has one more element)
    }
}
