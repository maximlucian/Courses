package chapter_4_CORE_APIS.arraysssssss;

public class First {
    public static void main(String[] args) {
        int[] numbers = new int[3];     //here, the elements in the Array Object (the ints) are set to their default value
                                                                                //in the case of the int, that is 0
        System.out.println(numbers);        //this prints out the memory address of the object

        System.out.println(numbers.length); //  the size

        System.out.println(numbers[0]);     //content on position 0

        int[] numbersSecond = new int[] {12, 13, 14};   //this declaration gives out the initial values, and as they are 3
                                                        //the size is also set to 3
        int[] numbersNotRedundant = {12, 13, 14}; //this is the non-redundant type of declaration in this case (doesn't repeat int[] left and right as well)
                    //  approach called an anonymous array. It is anonymous because you don’t specify the type and size.


    }
}
