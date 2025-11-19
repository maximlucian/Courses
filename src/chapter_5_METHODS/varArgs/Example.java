package chapter_5_METHODS.varArgs;

public class Example {
        public static void dogWalking(int start, int... steps) {
            System.out.println(steps.length);
        }
    public static void main(String[] args) {

            dogWalking(1, 2);   //1
//            dogWalking(2, null);      (allowed for varargs but)    CANNOT give NULL to Int TYPE.  NullPointerException in dogWalking
            dogWalking(3, 1, 2, 3);     //3
            dogWalking(4, new int[] {1, 2}); //2
    }
}
