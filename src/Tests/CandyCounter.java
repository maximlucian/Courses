package Tests;

public class CandyCounter {
    static long addCandy(double fruit, float vegetables) {
//        return (int) fruit + vegetables;                          the code will not work because of this line of code (cannot cast like that without placing
//                                                                                      fruit + vegetables into paranthesis --> (fruit + vegetables)

    return 0;
    }

    public static void main(String[] args) {
        System.out.println(addCandy(1.4, 2.4f) + ", ");
        System.out.println(addCandy(1.9, (float) 4) + ", ");
        System.out.print(addCandy((long) (int) (short) 2, (float) 4));
    }
}
