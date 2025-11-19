package chapter_5_METHODS.staticExplained;

public class Gorilla {
    public static int count;

    public static void addGorilla() {
        count++;
    }

    public void babyGorilla() {
        count++;
    }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
//        babyGorilla();     // This does not compile
    }

    public int total;
    public static double average;
//            = total / count;  // This also does not compile
}