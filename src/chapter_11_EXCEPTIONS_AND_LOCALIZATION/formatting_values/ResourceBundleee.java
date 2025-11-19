package chapter_11_EXCEPTIONS_AND_LOCALIZATION.formatting_values;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleee {
    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello")
                + ", " + rb.getString("open"));
    }

    public static void main(String[] args) {
        var us = Locale.of("en", "US");
        var france = Locale.of("fr", "FR");
        printWelcomeMessage(us);     // Hello, The zoo is open
        printWelcomeMessage(france); // Bonjour, Le zoo est ouvert
    }
}
