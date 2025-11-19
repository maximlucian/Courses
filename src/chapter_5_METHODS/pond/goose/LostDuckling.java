package chapter_5_METHODS.pond.goose;

import chapter_5_METHODS.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        var teacher = new DuckTeacher();
        teacher.swim();                                  // allowed
        System.out.print("Thanks " + teacher.name);       // allowed
    }
}