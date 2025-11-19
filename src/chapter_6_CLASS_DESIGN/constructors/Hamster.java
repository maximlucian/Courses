package chapter_6_CLASS_DESIGN.constructors;

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight, String color) {  // First constructor
        this.weight = weight;
        this.color = color;
    }

    public Hamster(int weight) {                // Second constructor
        this.weight = weight;
        color = "brown";       //1 parameter when above there are 2, so they can both live together
    }
}