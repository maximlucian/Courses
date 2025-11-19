package chapter_5_METHODS.pond.swan;
import chapter_5_METHODS.pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        var duck = new MotherDuck();
//        duck.quack();                       //this will not work because default access does not allow access in different packages
//        System.out.print(duck.noise);      //if the quack() method and noise, were to be protected or public, that would be possible
    }
}