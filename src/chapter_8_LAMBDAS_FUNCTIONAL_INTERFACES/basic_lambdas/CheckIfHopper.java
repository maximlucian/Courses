package chapter_8_LAMBDAS_FUNCTIONAL_INTERFACES.basic_lambdas;

public class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a) {
        return a.canHop();
    }
}
