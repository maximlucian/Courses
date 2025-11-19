package chapter__11_EXCEPTIONS_AND_LOCALIZATION.return_codes_vs_exceptions;

public class ExampleWithSomeExplaining {

    public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) { return i; }
        }
        return -1;      // here we have the basic return -1; which does exactly what it is called
    }                           //it simply says "no match is found" but this is not good for production
}                       //we need the exception thrown, after all, that's why we have an exceptions framework

            //we have 2 KINDS OF EXCEPTIONS!!! CHECKED AND UNCHECKED


        // CHECKED EXCEPTIONS INHERIT EXCEPTION (and Throwable) but NOT RUNTIME EXCEPTION or ERROR

//        an unchecked - it does not need to be declared or handled by the application code where it is thrown
//        UNCHECKED EXCEPTIONS INHERIT RUNTIME EXCEPTION AND ERROR (they are reffered to as runtime exceptions most of the time)
