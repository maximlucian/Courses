package chapter_4_CORE_APIS.StringBuilderIsMutable;

public class Methodss {
    static void main() {
        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));   //this turns the StringBuilder into a String (prints anim, stops at "al)
        int len = sb.length();          //like the name says length
        char ch = sb.charAt(3);         //finds the char at a certain position
        System.out.println(sub + " " + len + " " + ch);

        sb.insert(4, "-");      //you can also insert something with insert

        sb.delete(1, 3);
        sb.deleteCharAt(5);         //if you place 20 here (outside of the StringBuilder) you will get an exception, BUT
        sb.delete(5, 100);          //this will compile, as the compiler will assume you meant the end of the stringbuilder

        sb.replace(4, 100, "st");

        System.out.println(sb.toString());

        var reversed = new StringBuilder(sb.reverse());
        System.out.println(reversed);           // .reverse does exactly what it looks it does. it reverses the characters in the
                                               // sequences and returns a reference to the current StringBuilder
        sb.toString(); //this method turns sb to a String. lots of things require strings instead of StringBuilders, so, pretty useful
    }
}
