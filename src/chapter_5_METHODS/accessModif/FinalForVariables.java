package chapter_5_METHODS.accessModif;

public class FinalForVariables {

    public static class Animal {
        String name = new String();
        public void setName(String name) {
            this.name = name;
        }
        public void getName() {
            System.out.println(name);
        }
    }

    public static void zooAnimal() {
        final int rest = 5;
        final int[] friends = new int[3];
        final Animal giraffe = new Animal();

//        rest = 6;  this assignement will not work. cannot change final primitive values or immutable Objects!!!! (all the wrappers + String)
        //Integer Long and so on
        giraffe.setName("George");  // works, as we are changing the value of an object. the reference becomes final, but the object (class Animal) is mutable
        friends[2] = 2;     //we can change the contents of an Array, provided the values aren't reassigned
        giraffe.getName();
    }

    public static void main(String[] args) {
        zooAnimal();
    }

    public class PolarBear {
        final int age = 10;             //declared AND initialized    1111111111
        final int fishEaten;            //declared fishEaten HERE
        final String name;              //declared name HERE

        { fishEaten = 10; }         //INITIALIZED fishEaten IN AN INITIALIZATION BLOCK 2222222222222222

        public PolarBear() {
            name = "Robert";            //initialized robert IN A CONSTRUCTOR 333333333333      the only VALID 3 METHODDD
        }
    }
}
