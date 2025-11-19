//6
package chapter_1_BASICS.coding_for_dummies.codeBlocks;

public class ChickTwo {
    private String name = "Fluffy";
    {System.out.println("Setting Field");}
    public ChickTwo() {
        name = "Tiny";
        System.out.println("Setting Constructor");
    }

    public static void main(String[] args) {
        ChickTwo chick = new ChickTwo();
        System.out.println(chick.name);
    }

}

/*  This shows exactly how it works and if you press debug
    you will see exactly how it goes every step of the way

    If we would have done this:
    { System.out.println(name); }
    private String name = "Fluffy";

    the code would not compile doe to the fact that "name" has to be initialized first (ORDER MATTERS!!!)
 */


//Up next: Egg.java