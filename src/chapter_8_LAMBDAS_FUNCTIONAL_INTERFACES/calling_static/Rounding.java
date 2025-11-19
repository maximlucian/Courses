package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.calling_static;

public class Rounding implements Converter {

    Converter methodRef = Math::round;
    Converter lambda = x -> Math.round(x);

    @Override
    public long round(double num) {             //context makes java decide if we use this overloaded method or the one
        return 0;                           //present in Converter
    }

}
