package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.functional_interfaces;

public interface Skip extends Sprint {      //this is not a valid functional interface because it has two abstract methods
    void skip();                            //skip() and the inherited one (from Sprint)
}
