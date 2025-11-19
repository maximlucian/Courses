package chapter_3_MAKING_DECISIONS.switchStatements;

public class SysoWithSwitch {
    //If you want to print out some elements without an "if", there are 2 switch methods, one pretty, one ugly
//    we will start with the ugly one
    public String name (String name) {

        switch (name) {}        // valid
        // SWITCH STATEMENT
        switch (name) {
            case "Michael": System.out.println(1);
            break;
            case "john", "Olivia": System.out.println(2);
            break;
            default: System.out.println(999);
            break;
        }
        // SWITCH EXPRESSION
        System.out.println(switch (name) {
            case "Michael"         -> 1;
            case "john", "Olivia"  -> 2;
            default                -> 999;
        });

        int time = 3;
        String description = switch (time) { // #5
            case 10 -> "Morning";
            default -> "Late";
        };

        return name;
    }
}
//            if a swtich uses both ":" and "->" in the same statement, we will get an error