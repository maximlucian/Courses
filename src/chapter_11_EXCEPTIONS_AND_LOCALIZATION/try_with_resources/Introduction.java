package chapter_11_EXCEPTIONS_AND_LOCALIZATION.try_with_resources;

import java.io.FileInputStream;
import java.io.IOException;

public class Introduction {

    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myfile.txt");
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void readFileWithTryWithResources(String file) {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();            //this is more easy to read, write, and handle
        }
    }
}
