package chapter_5_METHODS.staticExplained;

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
//    static final double height;   //due to the fact a final was not give a value. this will give out an error
    static { bamboo = 5;}
}