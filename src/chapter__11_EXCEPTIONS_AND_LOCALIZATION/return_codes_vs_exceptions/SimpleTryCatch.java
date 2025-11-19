package chapter__11_EXCEPTIONS_AND_LOCALIZATION.return_codes_vs_exceptions;

import java.io.IOException;

public class SimpleTryCatch {

    void fall(int distance) {
        try {
            if(distance> 10) {
                throw new IOException();
            }
        } catch (Exception e) { //catch uses Exception, not IOException (because IO is a subclass of Exception)
            e.printStackTrace();
        }
    }

}
