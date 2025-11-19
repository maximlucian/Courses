package chapter_5_METHODS.pond.inland;

import chapter_5_METHODS.pond.shore.Bird;

public class BirdWatcherFromAfar {       // Not a subclass of Bird
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater();               // DOES NOT COMPILE
//        System.out.print(bird.text);       // DOES NOT COMPILE
    }
}
