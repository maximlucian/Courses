package chapter_4_CORE_APIS.formattedString;

public class Example {
    public static void main(String[] args) {
        var name = "James";
        var score = 90.25;
        var total = 100;

        System.out.println("%s:%n Score: %.2f out of %d"        //again, %n inseamna break si vine linie noua
                .formatted(name, score, total));        //daca punem gresit %s %d %f (tag-urile) primim IllegalFormatException

//        avem si ceva de genul daca vrem
        System.out.format("[%.2f]", score); //aici %.2f e relevant [] doar arata formatul in completare pt cum sa fie aratat score
                                    //%f e abstract si va lua valoarea care ii e desemnata prin "score", iar .2 arata ca vrem numai
                                                                                                // 2 decimale dupa .

    }
}
