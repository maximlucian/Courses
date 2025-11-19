package chapter_6_CLASS_DESIGN.references;

public class Flamingo {
    private String color = null;
    public void setColor(String color) {
        color = color;
    }
    public static void main(String... unused) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.print(f.color);  //this will print out null, as the color = color, we are not using the this.color = color;
                                                                        //nu instantiem
    }
}