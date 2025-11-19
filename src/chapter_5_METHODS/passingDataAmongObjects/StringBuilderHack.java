package chapter_5_METHODS.passingDataAmongObjects;

public class StringBuilderHack {
    public class Dog {
        public static void main(String[] args) {
            var name = new StringBuilder("Webby");
            speak(name);
            System.out.print(name);   // WebbyGeorgette
        }
        public static void speak(StringBuilder s) {
            s.append("Georgette");  //if you did not forget, StringBuilder is mutable, so even if we have a different reference
        }                       //the object changes in the memory. as many fingers point to a melting icecream,
    }                                           // it is still the same icecream melting
}
