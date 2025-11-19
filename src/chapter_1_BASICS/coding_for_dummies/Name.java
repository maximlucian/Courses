//4
package chapter_1_BASICS.coding_for_dummies;

public class Name {
    String last = "Maxim";
    String first = "Luci";
    String fullName = last + ' ' + first;

    public static void main(String[] args) {
    Name name = new Name();
    System.out.println(name.fullName);
    }
}

//Up next: codeBlocks
