package chapter_4_CORE_APIS.formattedString;

public class FormattingStrings {

    //We have a series of methods used to format String values using formatting flags

    //They are used to build a formatted String in a single method call compared to lots of format and concatenation operations

    //They return a reference to the instance they are called on so that operations can be chained together
/*
            public static String format(String format, Object... args) {}

            public static String format(Locale loc, String format, Object... args) {}

            public String formatted(Object... args) {}

 */
    static void main() {

        String name = new String("Alexandra");
        int orderId = 3;

        System.out.println("Hello " + name + ", order " + orderId + " is ready");

        System.out.println(String.format("Hello %s, order %d is ready",
                name, orderId));
        System.out.println("Hello %s, order %d is ready"
                .formatted(name, orderId));
    }

}
