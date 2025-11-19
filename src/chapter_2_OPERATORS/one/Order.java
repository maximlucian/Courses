package chapter_2_OPERATORS.one;

public class Order {
    public static void main(String[] args) {
        int cookies = 4;
        double reward = 3 + 2 * -- cookies; //here we first turn cookies' value from 4 to 3
        System.out.println(cookies);
    }
}

// Next up: ComplementAndNegation.java