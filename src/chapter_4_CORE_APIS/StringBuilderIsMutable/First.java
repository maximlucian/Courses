package chapter_4_CORE_APIS.StringBuilderIsMutable;

public class First {
    static void main() {
        // 3 types to construct a StringBuilder
        StringBuilder not = new StringBuilder();    //no details regarding size or value
        StringBuilder notEmpty = new StringBuilder("new");  //give value and the size automatically sets
        StringBuilder size = new StringBuilder(10); //give only the size with no value

        StringBuilder ana = new StringBuilder();            //this is StringBuilder. while we did 26 changes,there is only 1 object
        for (char current = 'a'; current <= 'z'; current++) {   //unlike String, that would create a new object for any new iteration(27 total)
            ana.append(current);                        // this is due to the fact StringBuilder is MUTABLE while String isn't
        }
        System.out.println(ana);

        StringBuilder sb = new StringBuilder("This");
        sb.append("\nis\n");
        sb.append("Sparta");
        System.out.println(sb);     //only 1 object used!!! cool huh?

//    now let's get something clear. only 1 object. but it can have 100000 references (not really the code would pop but you get it)

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a;
        b = a.append("de");
        b = b.append("f").append("g");      //this means that both a and b reference an object with value abcdefg

//        btw YOU CAN ALSO APPEND CODE POINTS!!!

        b = b.appendCodePoint(87);

        System.out.println(a);
    }
}
