package chapter_5_METHODS.pond.shore;

public class Bird {
    protected String text = "floating";
    protected void floatInWater() {
        System.out.print(text);         // protected access is ok
    }
}