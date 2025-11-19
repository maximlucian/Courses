package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.basic_lambdas;

public class Duckling {
    public static void makeSound(String sound) {
//        LearnToSpeak learner = s -> System.out.println(s);    //instead of using the variable s only for a syso
        LearnToSpeak learner = System.out::println;     //we tell the code "we ll call you when we need a syso" and use no variable
        DuckHelper.teacher(sound, learner);
    }
}
