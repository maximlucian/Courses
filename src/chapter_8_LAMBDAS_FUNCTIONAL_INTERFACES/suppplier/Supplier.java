package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.suppplier;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}

