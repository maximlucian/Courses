//10
package chapter_1_BASICS.primitivesAndReference;

public class StringToInt {
    //This line of code turns a String to an int
    int primitive = Integer.parseInt("123");
    //This line of code turns a String to an Integer
    Integer wrapper = Integer.valueOf("123");

    //In the case we offer an invalid value for the "valueOf" method
    Integer wrapperWrong = Integer.valueOf("five");
    //It will throw a NumberFormatException

}

// Next up: Booleann
