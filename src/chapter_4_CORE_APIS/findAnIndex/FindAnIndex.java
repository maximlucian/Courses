package chapter_4_CORE_APIS.findAnIndex;

public class FindAnIndex {
    static void main() {
        String name = new String("Ornitorincul");

        System.out.println(name.indexOf('r'));              //finding the position of the char
        System.out.println(name.indexOf('r', 3));
        System.out.println(name.indexOf('r', 3, 7));
        System.out.println(name.indexOf("r"));          //finding the position of a String      both give out the start position
        System.out.println(name.indexOf("rin", 3));
        System.out.println(name.indexOf("rin", 3, 100));        //exception because 100 is OutOfBounds

    }
}
