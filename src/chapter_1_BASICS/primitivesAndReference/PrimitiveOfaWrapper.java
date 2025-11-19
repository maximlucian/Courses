//13
package chapter_1_BASICS.primitivesAndReference;

public class PrimitiveOfaWrapper {
    public static void main(String[] args) {
        Double apple = Double.valueOf("209.99");     //turns the String into a Double reference type
        System.out.println(apple.byteValue());          //returns primitive byte value - even if it does not have a value that
                                                        // high it still returns something (-47 to be more precise)
        System.out.println(apple.intValue());         //returns primitive int value
        System.out.println(apple.doubleValue());        //returns primitive double value
    }
}

// Next up: CompareIntegers
