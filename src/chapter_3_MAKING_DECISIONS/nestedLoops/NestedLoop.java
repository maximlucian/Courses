package chapter_3_MAKING_DECISIONS.nestedLoops;

public class NestedLoop {
    public void Numbers() {
        int[][] myComplexArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray) {                //we can add optional labels to these loops
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.println(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }
}
