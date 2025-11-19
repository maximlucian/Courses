package chapter_6_CLASS_DESIGN.overriding;

import java.io.FileNotFoundException;

public class GalapagosTortoise extends Reptile {
    public void sleep() throws FileNotFoundException {
    }

//    public void hide() throws FileNotFoundException {
//    }
//                                      //these two will not compile due to the fact they use exceptions that are not in range of
//                                              //the parent class
//    public void exitShell() throws IOException {
//    }
}
