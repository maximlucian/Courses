package chapter_3_MAKING_DECISIONS.nestedLoops;

public class BreakAndLabels {
    public static void main(String[] args) {
        int[][] list = {{1, 2}, {3, 4}, {5, 6}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;          //this breaks out of the entire loop, not just the child loop, but the parent loop directly
                }
            }
        }

        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + "not found");
        } else {
            System.out.println("Value " + searchValue + " found at:" + "(" + positionX + "," + positionY + ")");
        }
    }
}
