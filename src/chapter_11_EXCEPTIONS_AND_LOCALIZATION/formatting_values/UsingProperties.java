package chapter_11_EXCEPTIONS_AND_LOCALIZATION.formatting_values;

import java.util.Properties;
public class UsingProperties {
    public static void main(String[] args) {
        var props = new Properties();
        props.setProperty("name", "Our zoo");
        props.setProperty("open", "10am");
    }
}
