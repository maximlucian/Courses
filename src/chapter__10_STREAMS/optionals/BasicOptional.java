package chapter__10_STREAMS.optionals;

import java.util.Optional;

public class BasicOptional {
    public static void main(String[] args) {
//        System.out.println(Optional.of(a));
        System.out.println(average(90, 100));
        System.out.println(average());

        Optional<Double> opt = average(90, 100);        //if this would be empty (no 90, 100), it would throw the NoSuchElementException
        if (opt.isPresent())
            System.out.println(opt.get());

        Integer value = 13;
        Optional o = (value == null) ? Optional.empty() : Optional.of(value);   //use this instead of just empty() to
                                                                            // make a choice in any of the cases (empty or not empty)
    }

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

}
