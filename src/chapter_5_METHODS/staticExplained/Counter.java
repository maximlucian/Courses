package chapter_5_METHODS.staticExplained;

public class Counter {
    private static int count;
    public Counter() { count++; }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count);     // this will output 3 as each time we call Counter it does coun++, and count is static
    }
}