package chapter_5_METHODS.staticExplained;

import java.util.List;
import static java.util.Arrays.asList;   //the static import we can call asList() anywhere in this class without having
public class ImportedAsListAsStatic {   //to write Arrays.asList() — it’s available class-wide
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // No Arrays. prefix
    }
}