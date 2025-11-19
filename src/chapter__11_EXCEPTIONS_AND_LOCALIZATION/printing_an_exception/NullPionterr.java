package chapter__11_EXCEPTIONS_AND_LOCALIZATION.printing_an_exception;

public class NullPionterr {
    private int numberEggs;

    public void setNumberEggs(int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException("# eggs must not be negative");  //Exception in thread "main" java.lang.IllegalArgumentException:
                                                                                //# eggs must not be negative
        this.numberEggs = numberEggs;
    }
    
    
        static String name;
        public void hop() {
            System.out.print(name.toLowerCase() + " is hopping");
        }
        public static void main(String[] args) {
            new NullPionterr().hop();
        }
}
