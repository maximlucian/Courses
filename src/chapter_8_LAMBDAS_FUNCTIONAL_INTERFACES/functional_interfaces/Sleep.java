package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.functional_interfaces;

public interface Sleep {
    private void snore() {}
    default int getZzz() { return 1; }          //this is not a valid functinal interface as it does not have an
}                                                       //ABSTRACT method, only a default and a private one
