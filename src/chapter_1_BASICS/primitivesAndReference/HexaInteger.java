//12
package chapter_1_BASICS.primitivesAndReference;

public class HexaInteger {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf("3", 16));  // "3" → 3 × 16⁰ = 3
        System.out.println(Integer.valueOf("10", 16)); // "10" → 1 × 16¹ + 0 × 16⁰ = 16
        System.out.println(Integer.valueOf("15", 16)); // "15" → 1 × 16¹ + 5 × 16⁰ = 21
        System.out.println(Integer.valueOf("115", 16)); // "115" → 1 × 16² + 1 × 16¹ + 5 × 16⁰ = 256 + 16 + 5 = 277
        System.out.println(Integer.valueOf("E", 16));  // "E" → 14 × 16⁰ = 14

//        System.out.println(Integer.valueOf("G", 16));  This will cause a compilation error because G is out of bounds
//        The hexadecimal (that 16 you see) supports letters from A to F. Because there are 10 cifre, then there is space for the
//        first 6 letters (a b c d e f)
    }
}

// Up next: PrimitiveOfaWrapper.java
