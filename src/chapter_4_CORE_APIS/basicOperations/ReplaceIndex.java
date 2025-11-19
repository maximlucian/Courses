package chapter_4_CORE_APIS.basicOperations;

public class ReplaceIndex {
    public static void main(String[] args) {

        String name = new String("abduction");

        name = name.replace('c', 't');   //replace all chars found with the provided char

        name = name.replace("abd", "asc"); //can use it with a sequence of chars

        System.out.println(name);

    }
}
