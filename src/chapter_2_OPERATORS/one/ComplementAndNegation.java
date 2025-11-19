package chapter_2_OPERATORS.one;

public class ComplementAndNegation {
    public static void main(String[] args) {
        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep);
        System.out.println(!isAnimalAsleep);
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println(isAnimalAsleep);
//                                  Now you saw the negations
        int number = 70;
        int bitNegated = ~number;      //this is a bit-wise negation, meaning the number turns from 70 to -71, not -70
        int classicNegated = -number;  //this is a classical negation and will be -70
        System.out.println(number);
        System.out.println(bitNegated);

        int parkAttendance = 0;
        System.out.println(parkAttendance);    // 0
        System.out.println(++parkAttendance);  // 1
        System.out.println(parkAttendance);    // 1
        System.out.println(parkAttendance--);  // 1
        System.out.println(parkAttendance);    // 0
    }
}

// Next up: Castingg.java
