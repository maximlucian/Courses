package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.basic_lambdas;

import java.util.*;

public class TraditionalSearch {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, new CheckIfHopper());
//        print(animals, a -> a.canHop());      lambda version of what you see above
//        print(animals, a -> a.canSwim());     this is the version where we check if the animals can swim
//        print(animals, a -> !a.canSwim());    here we check if they cannot swim

//        a -> a.canHop()
                                    //this is what the line above technically does (but it is shorter and cooler)
//        (Animal a) -> { return a.canHop(); }
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            // General check
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}