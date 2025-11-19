package chapter_3_MAKING_DECISIONS.forEachLoop;

import java.util.List;

public class Comparison {

    // let's compare the for and for-each loops to see which is better in some cases

    void printNames (String[] names) {
        for (int counter = 0; counter < names.length; counter++) {
            System.out.println(names[counter]);
        }                                           // LONG AND UGLY
    }

    void printNamesBetter (String[] names) {
        for (var name : names) {
            System.out.println(name);           //NEATTT
        }
    }

    void printNamesFromAList (List<String> names) {
        for (var name : names) {
            System.out.println(name);       //You can do it on a list as well
        }
    }
}
