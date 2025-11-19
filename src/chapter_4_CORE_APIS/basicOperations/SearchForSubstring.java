package chapter_4_CORE_APIS.basicOperations;

public class SearchForSubstring {
    static void main() {
        String cow = new String("    Mil ka  ");
        System.out.println(cow.startsWith("mil"));        //this searches if there is somewhere in this code that starts with a prefix
        System.out.println(cow.startsWith("Mil", 3));   //it is case sensitive though

        System.out.println(cow.endsWith("ka"));             //if the String ends with a suffix we added (only has this option though)
        System.out.println(cow.contains("milk"));        //checks if the String contains the charSequence we are looking for
                                                                    //ALL ARE CASE SENSITIVE
        char ch = '\u2000';  //unicode for whitespace

        System.out.println(cow.trim().length());

        System.out.println(cow.strip().length());
        System.out.println(cow.stripLeading().length());
        System.out.println(cow.stripTrailing().length());

        System.out.println(cow.indent(5));    //adds 3 whitespaces at the beginning of each line of the String (if you put -3
                                                                                // it will try to remove 3 white spaces) (no exception if
                                                                // give a number that is greater than the number of white spaces you have)
        System.out.println(cow.stripIndent());  //removes all the whitespaces (beginning and end) in the String (shifts everything to left)
                                        //useful when a String was built with concatenation


    }
}
