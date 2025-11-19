//7
package chapter_1_BASICS.coding_for_dummies.codeBlocks;

public class Egg {
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);  //if you wanted to print the object reference you could only use "egg" instead of "egg.number"
    }
    private int number = 3;
    {number = 4;}
}

/*  We can see here that order matters
Program start
 └── main(String[] args)  [static context]
      └── new Egg()  → triggers object creation
           ├── Step 1: allocate memory (default values → number = 0)
             ├── Step 2: field initializer executes → number = 3
               ├── Step 3: instance initializer block executes → number = 4
                 └── Step 4: constructor executes → number = 5
      └── print egg.number  → outputs 5

 */

// Oh btw. A primitive is a value in memory. (such as a number or character)

//Up next: primitivesAndReference -> Numbers.java
