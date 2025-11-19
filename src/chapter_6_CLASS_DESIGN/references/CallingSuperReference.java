package chapter_6_CLASS_DESIGN.references;

public class CallingSuperReference extends SuperReference {

    protected int speed = 20;

    public int getSpeed() {
//        return speed;     //causes the code to print 20
        return super.speed;  // Causes the program to now print 10
    }

    public static void main(String[] data) {
        var croc = new CallingSuperReference();
        System.out.println(croc.getSpeed());  // 10
    }
}

