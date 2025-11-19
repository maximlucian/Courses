package chapter_2_OPERATORS.one;

public class BitWise {

    public static void main(String[] args) {
        int number = 70;
        System.out.println(number);            // 70
        System.out.println(number & number);   // 70
        System.out.println(number | number);   // 70

        int negated = ~number;
        System.out.println(negated);           // -71

        System.out.println(number & negated);  // 0
        System.out.println(number | negated);  // -1
        System.out.println(number ^ number);   // 0
        System.out.println(number ^ negated);  // -1
    }
}
