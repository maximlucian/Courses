package chapter_5_METHODS.autoBoxingAndUnboxing;

public class Chimpanzee {
        public void rest(Long x) {
            System.out.print("long");
        }
        public static void main(String[] args) {
            var g = new Chimpanzee();
//         g.rest(8);  //this does not compile as we have a Long, not an int that should be provided
        }   //even if casting or autoboxing are done by java, they cannot both be done at the same time (if it were long it would have worked)
}
