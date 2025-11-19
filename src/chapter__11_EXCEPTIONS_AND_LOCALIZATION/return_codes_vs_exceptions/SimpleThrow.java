package chapter__11_EXCEPTIONS_AND_LOCALIZATION.return_codes_vs_exceptions;

import java.io.IOException;

public class SimpleThrow {
    void fall(int distance) throws IOException {        //throws declares that the method MIGHT throw an exception
        if(distance> 10) {
            throw new IOException();        //throw tells java "hey, I want to throw an exception"
        }
    }
}
