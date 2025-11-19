package chapter_5_METHODS.staticExplained;

public class StaticInitializers {
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;
    static {
        NUM_SECONDS_PER_MINUTE = 60;                //these guys are static initializers. they run when the class is first used
        NUM_MINUTES_PER_HOUR = 60;                  //the statements in them run and assign any static variable as needed
    }                               //they can be changed even though they are final thanks to the fact that static is placed in
    static {                                                        //front of final. this gives priority to the static type
        NUM_SECONDS_PER_HOUR
                = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }
}
