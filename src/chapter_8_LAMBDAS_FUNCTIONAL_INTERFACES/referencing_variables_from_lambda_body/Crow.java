package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.referencing_variables_from_lambda_body;

import java.util.function.Consumer;

public class Crow {
    private String color;
    public void caw(String name) {
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);    //if we try to use "color" outside of the lambda
                                                    //the compiler will no longer consider "color" as final and line 10 will
                                //give out an error due to the fact it assumes it is final (if it IS NOT USED ANYWHERE ELSE)
    }
}