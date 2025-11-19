//5
package chapter_1_BASICS.coding_for_dummies.codeBlocks;
/*  First let's get some things straight:
    Everything inside the {} (or inside the braces) is called a "CODE BLOCK"
    Sometimes code blocks are inside a method. These are run when the method is called.
    Other times, code blocks appear outside a method. These are called "INSTANCE INITIALIZERS".
 */

public class Bird {
    public static void main(String[] args) {
        {
            System.out.println("Good Morning Kanye");
        }
    }

    {
        System.out.println("Shut up"); // Instance initialized (it is outside of any method) -- FYI the instance initializer is
                                       // just that, it will not show because it is not run anywhere (we only say good morning
                                       // to Kanye
    }
}
/* 4 code blocks here (you can see that) -- Bird -- main -- first Syso -- second Syso
   The fact that you need an equal amount of { as you have } is called the "BALANCED PARANTHESIS PROBLEM" - remember that
   Fields and instance initializer blocks are run in the order in which they appear in the file.
   The constructor runs after all fields and instance initializer blocks have run.

*/
// Up next: ChickTwo