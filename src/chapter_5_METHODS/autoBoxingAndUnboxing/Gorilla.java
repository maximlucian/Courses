package chapter_5_METHODS.autoBoxingAndUnboxing;

public class Gorilla {
        public void climb(long t) {}
        public void swing(Integer u) {}
        public void jump(int v) {}
        public static void main(String[] args) {
            var c = new Gorilla();
            c.climb(123);
            c.swing(123);
//            c.jump(123L);  this will not compile because we want to ouput an int
        }
}
