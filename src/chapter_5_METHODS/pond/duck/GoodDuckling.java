package chapter_5_METHODS.pond.duck;


public class GoodDuckling {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack();                       // this will work because we have regular package access (default access)
        System.out.print(duck.noise);
    }
}