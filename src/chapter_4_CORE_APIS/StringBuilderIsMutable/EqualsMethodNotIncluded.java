package chapter_4_CORE_APIS.StringBuilderIsMutable;

public class EqualsMethodNotIncluded {

    public static void main(String[] args) {
        String name = new String("alice");
        String nameTwo = new String("alice");

        StringBuilder nameBuilder = new StringBuilder("adrian");
        StringBuilder nameBuilderTwo = new StringBuilder("adrian");

        System.out.println(name == nameTwo);            //this "==" checks if the references point at the same object
        System.out.println(nameBuilder == nameBuilderTwo);   //this "==" does the same

        System.out.println(name.equals(nameTwo));   //this compares the actual values of each object the references point to

//        System.out.println(name == nameBuilder);         this will give out an error due to the fact you
        System.out.println(name.equals(nameBuilder.toString())); //        cannot compare a String with a StringBuilder directly
            // ^this is the ok way to do it
        System.out.println(nameBuilder.equals(nameBuilderTwo));         //this still compares if the references point to the same object
        System.out.println(nameBuilder.toString().equals(nameBuilderTwo.toString()));   //this is how you actually compare the values
                                                                                        // of two StringBuilders (have to turn them to String)

    }
}
