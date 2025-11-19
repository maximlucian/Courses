package chapter_6_CLASS_DESIGN.references;

public class Duck {
    private String color;
    private int height;
    private int length;

    public void setData(int length, int theHeight) {
        length = this.length;  // this is no good
        height = theHeight;    // this is okay because we use another name than "height"
        this.color = "white";  // this is ok, but the this reference is not necessary here
    }

    public static void main(String[] args) {
        Duck b = new Duck();
        b.setData(1, 2);
        System.out.print(b.length + " " + b.height + " " + b.color);
    }
}
