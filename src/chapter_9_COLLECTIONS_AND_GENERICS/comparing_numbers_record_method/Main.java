package chapter_9_COLLECTIONS_AND_GENERICS.comparing_numbers_record_method;

public class Main {
    public static void main(String[] args) {

        var d1 = new ZooDuck(5, "Daffy");
        var d2 = new ZooDuck(7, "Donald");
        System.out.println(d1.compareTo(d2));   // -2
        System.out.println(d1.compareTo(d1));   // 0
        System.out.println(d2.compareTo(d1));   // 2

    }
}
