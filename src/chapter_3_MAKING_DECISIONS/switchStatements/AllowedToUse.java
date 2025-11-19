package chapter_3_MAKING_DECISIONS.switchStatements;

public class AllowedToUse {

    final int getCookies() { return 4; }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
//        case apples:        // DOES NOT COMPILE -- not a final int
//        case getCookies():  // DOES NOT COMPILE -- a method              this and the one below do not get their values before compile time
//        case cookies:      // DOES NOT COMPILE  -- final but still calls a method
            case 3 * 5:
        }
    }
}

