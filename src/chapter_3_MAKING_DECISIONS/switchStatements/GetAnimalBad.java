package chapter_3_MAKING_DECISIONS.switchStatements;


public class GetAnimalBad {


    public static void main(String[] args) {

    }

    String getAnimalBad(int type) {
        String animal;
        if (type == 0)
            animal = "Lion";
        else if (type == 1)
            animal = "Elephant";
        else if (type == 2 || type == 3)
            animal = "Alligator";
        else if (type == 4)
            animal = "Crane";
//        return animal;            everytime we add a new animal the code gets longer and uglier
//                                  if we return animal after the if, we will get an error for not initializing it,
//                                  well, this is not the case for switch
        return "yes"; //placed this just to skip an error
    }

    //      LOOK BELOW FOR A BETTER OPTION
    String getAnimalBetter(int type) {
        String animal;
        switch (type) {
            case 0:
                animal = "Lion";
                break;
            case 1:
                animal = "Elephant";
            case 2, 3:
                animal = "Alligator";
            case 4:
                animal = "Crane";
            default:
                animal = "Unknown";
        }
        return animal;      //see? no error here
    }
    //    LOOK BELOW FOR AN EVEN BETTER VERSION OF THIS

    String getAnimalEvenBetter(int type) {
        return switch (type) {
            case 0    -> "Lion";
            case 1    -> "Elephant";
            case 2, 3 -> "Alligator";
            case 4    -> "Crane";
            default   -> "Unknown";
        };
    }

}