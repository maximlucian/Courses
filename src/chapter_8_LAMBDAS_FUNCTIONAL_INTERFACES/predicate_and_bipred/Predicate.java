package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.predicate_and_bipred;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
    // omitted default and static methods
}
