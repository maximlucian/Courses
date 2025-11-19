package chapter_4_CORE_APIS.concatenation;

public class TextBlock {
    public static void main(String[] args) {
        String name = "Fluffy";
        String otherName = new String("Fluffy");    //fun fact - String implements the interface CharSequence

        String blockName = """
                           Fluffy""";       //Text Block

        System.out.println("a" + "b");  //this is called concatenation
        System.out.println("a" + "b" + 3);  //ab3
        System.out.println("a" + null);  //anull

        int i = 3;
        String four = "4";
        System.out.println(i + 3 + 3 + four);   //94  ---> we follow the order from left to right 1 operation at a time
        System.out.println(four.length());  //1 - prints out the length of the String "four"

        String word = "ornitor’inc";   //am folosit un apostrof stilizat care are un weight de codepoint, care e mai mare decat un char
        System.out.println(word.charAt(3));  // i - litera de la pozitia 3
//        System.out.println(word.charAt(20));   //exception IndexOutOfBounds
                         //basically a charat but for bigger values
        System.out.println(word.codePointAt(7));            //returns the numeric value of the codepoint at the index position
        System.out.println(word.codePointBefore(8));        // does the same thing but before the index
        System.out.println(word.codePointCount(7,8));               //shows the codepoint count in between the positions you indexed

        System.out.println(name.substring(4));
        System.out.println(name.substring(name.indexOf("n")));    //starts from the first find of the letter in the indexOf
//        System.out.println(name.substring(4,8));        //if the last value is above the length of the String it does not throw an exception
//                                                                                        apparently it throws an exception

    }
}
