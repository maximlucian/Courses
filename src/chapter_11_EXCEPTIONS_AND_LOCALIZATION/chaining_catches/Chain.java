package chapter_11_EXCEPTIONS_AND_LOCALIZATION.chaining_catches;

public class Chain {


    class AnimalsOutForAWalk extends RuntimeException {}

    class ExhibitClosed extends RuntimeException {}

    class ExhibitClosedForLunch extends ExhibitClosed {}

    public void visitPorcupine() {
        try {
//            seeAnimal();
        } catch (AnimalsOutForAWalk e) {            // first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {                 // second catch block
            System.out.print("not today");
        }
    }

    public void visitMonkeys() {
        try {
//            seeAnimal();
        } catch (ExhibitClosedForLunch e) {         // Subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) {                 // Superclass exception
            System.out.print("not today");
        }
    }
}
