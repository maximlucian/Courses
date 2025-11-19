package chapter_4_CORE_APIS.stringPoolExplained;

public class ChooseToUseItorNot {

    public static void main(String[] args) {
        var x = "hi";

        var y = new String("hi");

        System.out.println(x == y);  //this is false --- why?
                                //because the first declaration says "ok java use the string pool"
                            //then the second one (new String) tells the JVM "NOPE, make me another object)

        //however, we can easily tell Java to use the String Pool with .intern()
        // like this:

        var z = new String("hi").intern();

        System.out.println(x == z);  //this will be true  -- intern -> internal; got it? kinda easy
    }
}
