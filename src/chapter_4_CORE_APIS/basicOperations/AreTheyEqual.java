package chapter_4_CORE_APIS.basicOperations;

public class AreTheyEqual {
    public static void main(String[] args) {
        String name = new String("ornitorincul");
        String nameUpper = new String("ORNITORINCUL");
        String nameTwo = new String("rororo");

        System.out.println(name.equals(nameTwo));           //verifica egalitate
        System.out.println(name.equalsIgnoreCase(nameUpper));   //same dar ignora case-ul
    }
}
