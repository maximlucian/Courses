package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.unaryoperator_and_binary;

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
    // omitted static methods
}
