package chapter_4_CORE_APIS.stringPoolExplained;

public class Example {
    public static void main(String[] args) {

        var x = "hi";
        var y = "hi";

        var z = "bye";
        z = "hi";

        System.out.println(x == y);  //this is true due to the String Pool
        System.out.println(y == z);  //this is false due to the string pool
            //so what is String pool?
        //When we start the program, there is a pool of reserved strings in the memory, if we have
        //both x and y with the value "hi" at compile time, they point to the same String in the POOL
        // that is why the first syso is true

        // but if we change the value afterwards like we did with z, the code will give out false, as it did not have
                                                                                // that value at runtime
    }
}
