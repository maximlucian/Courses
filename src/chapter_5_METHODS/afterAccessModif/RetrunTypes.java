package chapter_5_METHODS.afterAccessModif;

public class RetrunTypes {

    public static void main() {         //both have to be static for this one to get the swim() method
        swim(10);
    }
    public static void swim(int distance) {        //this returns nothing, mostly "used for data manipulation"
        if(distance <= 0) {         //this doesn't return anything, thus it works
            // Exit early, nothing to do!
            return;
        }
        System.out.print("Fish is swimming " + distance + " meters");
    }

    public void hike() { return; }  //we use a return, but an EMPTY ONE, this actually RETURNS NOTHING SO IT WORKS

    //but if we have a non-void method and it doesn't return anything we will get an error

//    public String nothing(int a) {    //yup, this does not work. MAKE IT A VOID GOD DAMN IT
//        a += 10;
//        return;   //I put this here for you to remember empty "return" returns NOTHING
//    }

    String hike8(int a) {
        if (1 < 2) return "orange";
        return "apple";                   // COMPILER WARNING about unreachable code
    }

}
