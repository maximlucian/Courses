package chapter_5_METHODS.autoBoxingAndUnboxing;

public class Falcon {
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}            //these are overloaded methods
}                   //overloading can happen by changing any parameter, type, or order (but be careful so they don't overlap)
