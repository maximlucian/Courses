package chapter__11_EXCEPTIONS_AND_LOCALIZATION.formatting_values;

import java.util.Locale;

public class Locales {

    static void main(String[] args) {
        System.out.println(Locale.GERMAN);   // de          //KNOW THE DIFFERENCE
        System.out.println(Locale.GERMANY);  // de_DE

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        System.out.println(Locale.getDefault());  // en_US
        Locale locale = Locale.of("fr");
        Locale.setDefault(locale);
        System.out.println(Locale.getDefault());  // fr
    }
}
