package chapter_3_MAKING_DECISIONS.patternMatchin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class First {
    void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println(data.compareTo(5));
        }
    }
//        The cast is needed since the compareTo() method is defined on Integer, but not on Number.

    void compareIntegersShorter(Number number) {
            if (number instanceof final Integer data && data.compareTo(5) > 0) {       //the variable "data" is called the "pattern variable"
                                                                                      // it also supports an additional logical check (&& condition)
                System.out.println(data.compareTo(5));  //ClassCastException is avoided because the cast operation
//                data = 10; we can use final (to prevent reassignment of variables)
            }                                                           //only happens if the instanceof operator is true
    }

//      This cast is the shorter version of what you saw above

//    for instanceof, the type casted should be of the same type
//    public void openZoo(Number time) {
//        if(time instanceof String) {      THIS IS NOT POSSIBLE, as time is of Number type!!!
//            System.out.println(time);     oh btw kind reminder Integer type is both Object ad Number as well
//        }
//    }

    public static void main(String[] args) {
        String noObjectHere = null;

        if(!(noObjectHere instanceof String))           //if we negate it it is printed. null gets turned to false!!!!
            System.out.println("Only this one is printed");

        if(noObjectHere instanceof String s)
            System.out.println("Still not printed");

        if(noObjectHere instanceof String s && s.length() > -1)
            System.out.println("Nope, not this one either");
    }


}