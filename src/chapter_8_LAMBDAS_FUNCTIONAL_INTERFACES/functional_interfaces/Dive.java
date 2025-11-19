package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.functional_interfaces;

public interface Dive {
    String toString();              //this toString is not considered an abstract method as it is a public method implemented
    public boolean equals(Object o);    //in Object. it does not count as an abstract one
    public abstract int hashCode();
    public void dive();             //this is our abstract method, and the only one here, so Dive is a FUNCTIONAL INTERFACE
}
