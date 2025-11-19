package chapter_5_METHODS.varArgs;

public class RulesOfUse {

    public void swim(int... flopFlop) {
    }

    public static void walk(int start, int... steps) {
        int[] step2 = steps;           // Not necessary, but shows steps is of type int[]
        System.out.print(step2.length);
    }

//    public void walkWrong(int... step, int start){} this declaration is WRONG because the vararg (int... step) should be LAST

//    public void walkWrongAgain(int... start, int... step); this is WRONG again.

    // 2 RULES:  1.)  THE VARARG MUST BE LAST IN THE PARAMETER LIST
//                                           2.) THERE CAN ONLY BE 1 VARARG IN THE PARAMETER LIST


    public static void main(String[] args) {
        int i = 10;

        System.out.println("Something");
        //to call a method with varargs, you can pass in an array or just give a list of values and let java make it an array

        //Pass an array
        int[] data = new int[]{1, 2, 3};
        walk(1, data);

        //or PASS A LIST OF VALUES and JAVA WILL FIGURE IT OUT

        walk(2, 1, 2, 3);
    }
}
