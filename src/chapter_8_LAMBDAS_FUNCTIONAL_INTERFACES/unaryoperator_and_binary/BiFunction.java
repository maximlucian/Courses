package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.unaryoperator_and_binary;

@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
    // omitted default method
}