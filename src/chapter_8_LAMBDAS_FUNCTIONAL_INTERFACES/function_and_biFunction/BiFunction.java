package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.function_and_biFunction;

@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
    // omitted default method
}