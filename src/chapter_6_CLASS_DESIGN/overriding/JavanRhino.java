package chapter_6_CLASS_DESIGN.overriding;

public class JavanRhino extends Rhino {
    public String getName() {
        return "javan rhino";
    }

//    public CharSequence getColor() {  // the String type implements CharSequence, thus there is a mismatch in the datatype
//        return "grey";                    //if it were the other way around it would have worked
//    }
}
