package chapter_5_METHODS.pond.duck;


public class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck();
//        duck.quack();                   //this will not compile due to the fact the quack() method is private
//        System.out.print(duck.noise);
    }
}