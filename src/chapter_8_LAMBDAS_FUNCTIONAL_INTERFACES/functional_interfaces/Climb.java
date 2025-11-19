package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.functional_interfaces;

public interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }       //this indeed is a functional interface as it only has one
}                                                   //abstract method (reach())
