package chapter_3_MAKING_DECISIONS.nestedLoops;

public class ContinueAndLabels {
    public static void main(String[] args) {
        CLEANING: for (char stables = 'a'; stables <= 'd'; stables++) {
        for (int leopard = 1; leopard <= 3; leopard++) {
            if (stables == 'b' || leopard == 2) {
                continue CLEANING;    //goes back to CLEANING for and the for will move on from lopard = 2 to stables b and leopard = 0
            }                         //but pay attention on what results you want, here they are different without the CLEANING label placed
            System.out.println("Cleaning " + stables + ", " + leopard);
        }
        }
    }
}
