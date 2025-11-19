package chapter_4_CORE_APIS.basicOperations;

public class SubStringg {
    public static void main(String[] args) {
        String anda = new String("platipus");

        System.out.println(anda.indexOf('p'));

        System.out.println(anda.substring(3));

        System.out.println(anda.substring(3, 4));
        System.out.println(anda.substring(3, 1));    // this will give out an exception (cannot do the endIndex first
        System.out.println(anda.substring(3, 10)); // this will give out an exception as well because 10 is OutOfBounds

        System.out.println(anda.substring(3, 3));   // works but gives out an empty String
    }
}
