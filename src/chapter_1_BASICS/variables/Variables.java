//16
package chapter_1_BASICS.variables;

public class Variables {

    final int y = 10;
    int x = 20;
//    y = x + 10;  THIS DOES NOT COMPILE BECAUSE WE CANNOT CHANGE A "final int y".

    public void finalAnswer(boolean check) {
    int answer;
    int otherAnswer;
    int onlyOneBranch;
    if (check) {
        onlyOneBranch = 1;
        answer = 1;
    } else  {
        answer = 2;
    }
    System.out.println(answer);
//    System.out.println(onlyOneBranch); THIS gives out an error as Java recognizes the fact that "onlyOneBranch" might
//                                       not be initialized in one of the "if" cases (after else) - yup, the compiler is that good
    }

public static void main(String[] args) {
    final int[] favouriteNumbers = new int[10];
    favouriteNumbers[0] = 10;  // We can change the values within the int[]
    favouriteNumbers[1] = 20;  // But WE CANNOT CHANGE THE VALUE OF THE REFERENCE "favouriteNumbers" (like we did below)
//    favouriteNumbers = null; This will give out an error

    int y = 10;
    int x;
//    int reply = x + y;  THIS GIVES OUT AN ERROR (x is not initialized, thus we have no actual value to use)

}

}

// Next up: