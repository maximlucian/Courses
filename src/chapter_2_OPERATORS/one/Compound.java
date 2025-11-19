package chapter_2_OPERATORS.one;

public class Compound {
    public static void main(String[] args) {
        int camel = 2, giraffe = 5;
        camel *= giraffe;
        giraffe += 4;
        System.out.println(camel);
        System.out.println(giraffe);

        // we can use this compound operator in a way so that we can solve some casing problems such as:

        long a = 5;
        int b = 10;
//        b= b * a; will generate an error because the code is trying to cast b (an int) higher, not lower (to a long)
//         SOLUTION
        b *= a;   // the compound operator will turn b to a long, and after with no error
//                                                          (multiplication between two longs is okkk)
//                                                              then it will cast the resulting long to the int type of b
    }
}
