//11
package chapter_1_BASICS.primitivesAndReference;

public class Booleann {
    //For Boolean, if we use "valueOf" a fun fact should be mentioned
    public static void main(String[] args) {
        System.out.println(Boolean.valueOf("true"));      //output: TRUE
        System.out.println(Boolean.valueOf("tRUe"));      //output: TRUE
        System.out.println(Boolean.valueOf("false"));     //output: FALSE
        System.out.println(Boolean.valueOf("nimic relevant"));//output: FALSE
        System.out.println(Boolean.valueOf(null));        //output: FALSE

        //So:
        //-> not case-sensitive
        //-> anything different from the letters T R U and E in this order, big or small, is false
    }
}


// Up next: HexaInteger