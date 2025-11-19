package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.unaryoperator_and_binary;

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
    // omitted static method
}
