package chapter_11_EXCEPTIONS_AND_LOCALIZATION.formatting_values;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;

public class CompactNumberFormat {

    static void main() {
        var formatters = Stream.of(
                NumberFormat.getCompactNumberInstance(),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.getDefault(), NumberFormat.Style.LONG),

                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.SHORT),
                NumberFormat.getCompactNumberInstance(Locale.GERMAN, NumberFormat.Style.LONG),

                NumberFormat.getNumberInstance());

        formatters.map(s -> s.format(7_123_456)).forEach(System.out::println);
    }
}
