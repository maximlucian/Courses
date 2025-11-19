package chapter_6_CLASS_DESIGN.overriding;

public class Rider {
    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.print(c.getNumberOfHumps());  // 1
    }
}