package chapter_4_CORE_APIS.basicOperations;

public class IsItEmpty {
    static void main() {
        String car = new String("Honda");

        System.out.println(" ".isEmpty());  //checks if the String is empty
        System.out.println(" ".isBlank());  //checks if the String is blank (also true if String is empty)


    }
}
