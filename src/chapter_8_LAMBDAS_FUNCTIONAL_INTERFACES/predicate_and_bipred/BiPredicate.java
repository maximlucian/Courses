package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.predicate_and_bipred;

@FunctionalInterface
public interface BiPredicate<T, U> {
    boolean test(T t, U u);
    // omitted default methods
}
