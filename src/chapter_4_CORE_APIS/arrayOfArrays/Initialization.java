package chapter_4_CORE_APIS.arrayOfArrays;

public class Initialization {
    public static void main(String[] args) {
        //so we have the following
        int[][] rectangle = new int[3][2]; //this of it as an array that has an array on each element spot

        //you can also initialize it wihtout setting the size of the arrays within the arrays and doing it separately

        int[][] declarationDiff = new int[3][];

        declarationDiff[0] = new int[3];
        declarationDiff[1] = new int[2];
        declarationDiff[2] = new int[1];

        int[][] visualize = {{1, 2, 3}, {4}, {5, 6}};

        for (int i = 0; i < visualize.length; i++) {
            for (int j = 0; j < visualize[i].length; j++)
                System.out.print(visualize[i][j]);
            System.out.println();
        }

        for (int[] i : visualize) {         //better for - we have the for each loop
            for (int num : i) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
