package chapter_3_MAKING_DECISIONS.switchStatements;

public class WhenClauseAndPatternMatching {
    String getTrainer(Number height) {
        return switch (height) {
            case Integer i when i > 10 -> "Joseph";
            case Integer i -> "Daniel";
            case Double num when num >= 15 -> "Miha";
            case Double num -> "Adrian";
            case Number num -> "Ralph";
        };
    }

    void printMessage(Number height) {
        String message = switch(height) {
            case Integer i -> "Rounded:" + i;       //pattern matching
            case Double d -> "Precise:" + d;
            case Number n -> "Unknown:" + n;        //in this type of situations order matters
        };
        System.out.println(message);
    }

    void fishFish(String fish) {
        fish = null;
        System.out.println(switch (fish) {
            case "ClownFish" -> "Hello!";
            case "SilverFish" -> "Pretty!";
            case null -> "Who are you?";        //THIS HAPPENS ANYTIME WE USE CASE NULL!!!!
            default -> "Goodbye!";      //if we were to comment this, the code would no longer compile
        });                         //even if we were not in a syso and would have the switch outside of here,
    }                           //the compiler would consider this as "pattern matching" and it will need to be exhaustive

//      System.out.print(switch (fish) {
//        case String s when "ClownFish".equals(s) -> "Hello!";
//        case String s when "BlueTang".equals(s) -> "Hello again!";
//        default -> "Goodbye";                 DEFAULT HAS TO BE THE LAST EVERY TIME!!!
//        case null -> "No good";  // DOES NOT COMPILE
//    });

}
