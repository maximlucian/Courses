package chapter_5_METHODS.staticExplained;

//import static java.util.Arrays;   //impossible and of no use

import static java.util.Arrays.asList;

//static import java.util.Arrays .*; //impossible

public class BadUsageOfStaticImport {

    public static void main(String[] args) {
//        Arrays.asList("one");     //this gives out an error
        asList("one");          //we just saw that we can skip the Arrays. when we import static util.Arrays.asList
    }
}
