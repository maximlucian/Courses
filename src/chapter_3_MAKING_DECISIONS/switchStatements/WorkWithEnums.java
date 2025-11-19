package chapter_3_MAKING_DECISIONS.switchStatements;

public class WorkWithEnums {

    enum Anotimpuri { SPRING, SUMMER, WINTER, FALL}

    boolean shouldGetACoat(Anotimpuri s) {
        return switch (s) {
            case SPRING -> false;
            case SUMMER -> false;
            case WINTER -> true;
            case FALL -> true;
        };
    }
}
