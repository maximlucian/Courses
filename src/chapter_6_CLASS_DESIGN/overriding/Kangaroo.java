package chapter_6_CLASS_DESIGN.overriding;

public class Kangaroo extends Marsupial {
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight());  // this will print 50.0
        System.out.println(new Kangaroo().getAverageWeight());   // and this will print 70.0
    }
}
