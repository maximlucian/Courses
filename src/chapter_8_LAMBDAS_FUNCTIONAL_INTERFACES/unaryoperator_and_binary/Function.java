package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.unaryoperator_and_binary;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
    // omitted default and static methods
}