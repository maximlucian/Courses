//2
package chapter_1_BASICS.coding_for_dummies;

public class Chicken {
    int numEggs = 12; //initialization on the same line without constructor
    String name;

    public Chicken() {
        name = "Duke"; //initialization in constructor
    }

    public static void main(String[] args) {

        Chicken chicken = new Chicken();  //make an object -- type - name - new(initialization) - constructor
        System.out.println(chicken.name);
    }
}

/*
For most classes, you don’t have to code a constructor—the compiler will supply a “do nothing” default constructor for you.
There are some scenarios that do require you to declare a constructor.
 */

//Up next: Swan.java