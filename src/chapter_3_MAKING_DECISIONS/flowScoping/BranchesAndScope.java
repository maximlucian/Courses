package chapter_3_MAKING_DECISIONS.flowScoping;

public class BranchesAndScope {

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
//        else                      with or without this else, due to using instanceof the following (syso) is in scope when data is an Integer
            System.out.println(data.intValue());
    }
}
