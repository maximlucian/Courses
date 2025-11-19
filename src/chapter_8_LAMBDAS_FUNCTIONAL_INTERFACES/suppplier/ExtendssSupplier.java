package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.suppplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public abstract class ExtendssSupplier implements Supplier{
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();

        System.out.println(s3.get());  // these two will be empty Strings
        System.out.println(s4.get());

        Supplier<ArrayList<String>> s5 = ArrayList::new;
        ArrayList<String> a5 = s5.get();
        System.out.println(a5);  // []

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");


        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);

        var map2 = new HashMap<String, String>();
        BiConsumer<String, String> b12 = map2::put;
        BiConsumer<String, String> b22 = (k, v) -> map2.put(k, v);

        b12.accept("chicken", "Cluck");
        b22.accept("chick", "Tweep");

        System.out.println(map2);
    }
}
