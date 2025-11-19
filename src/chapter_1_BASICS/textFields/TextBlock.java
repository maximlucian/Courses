//15
package chapter_1_BASICS.textFields;

public class TextBlock {  //AKA String block
    public String label(String title, String author) {
        return """
                Book:
                """ + title + "by" + author;
    }
    public void prepare() {                             //FYI: text blocks require the field to be empty after the """
        String labelled = label("""             
                Java Study Guide
                   For Java 21
                2024 Edition""", "Jenna & Scott");
        System.out.println(labelled);
    }

    public static void main(String[] args) {
        TextBlock textBlock = new TextBlock();
        textBlock.prepare();

        String pyramid = """ 
                  *
                 * *    \"\"
                * * *   \"""
                """;

        System.out.println(pyramid);
    }
}

/* Formatting	Meaning in regular String	Meaning in text block
\"	                      "	                     "
\"""	              n/a – Invalid	            """
\"\"\"	                 """	                """
Space (at end of line)	Space	               Ignored
\s	Two spaces (\s is a space and preserves leading space on the line)	Two spaces
\ (at end of line)	 n/a – Invalid	        Omits new line on that line
 */

// Next up: variables\Variables.java