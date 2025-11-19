package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.function_and_biFunction;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
    // omitted default and static methods
}