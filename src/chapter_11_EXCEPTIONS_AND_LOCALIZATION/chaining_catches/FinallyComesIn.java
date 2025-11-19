package chapter_11_EXCEPTIONS_AND_LOCALIZATION.chaining_catches;

public class FinallyComesIn {
    public static void main(String[] unused) {
        StringBuilder sb = new StringBuilder();
        try {
            System.exit(0); //exit tells Java "STOP RIGHT HERE, we will not move forward"
        }
//        catch (Exception e) {
//            sb.append("c");
//        }
        finally {         //when finally is used, CATCH IS OPTIONAL!!!
            sb.append("f");
        }
        sb.append("a");
        System.out.print(sb.toString());
    }
}
