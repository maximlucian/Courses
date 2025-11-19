package chapter_3_MAKING_DECISIONS.switchStatements;

public class Yiield {
    int fish = 5;
    int length = 12;
    String name = switch (fish) {
        case 1 -> "Goldfish";
        case 2 -> { yield "Silverfish"; }               //yield is the "return" that does not end the method, but only the switch
        case 3 -> { if (length == 12) yield "Blobfish";
                        else yield "Green";
        }
        case 4 -> {
            throw new RuntimeException("Unsupported value");
        }
        default -> "Swordfish";
    };
}

