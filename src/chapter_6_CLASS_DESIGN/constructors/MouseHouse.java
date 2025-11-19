package chapter_6_CLASS_DESIGN.constructors;

public class MouseHouse {
    private final int volume;
    private final String type;

    {
        this.volume = 10;
    }

    public MouseHouse(String type) {
        this.type = type;
    }

//    public MouseHouse() {         //this will not work
//        this.volume = 2;
//    }
}
