package chapter_6_CLASS_DESIGN.constructors;

public class Mammal {
    public Mammal(int age) {
    }
}

//public class Seal extends Mammal {}  // something interesting happens here. both these Seal and Elephant classes will not compile
//                                          //this is due to the fact that Mammal defines a constructor, so the compiler does not
//public class Elephant extends Mammal {    //insert a default one (a no-argument constructor)
//    public Elephant() {}              // the compiler will insert a default one into Seal, but it will only be a simple
//}                                   //implementation that just calls an inexistent parent default constructor

//super() will not work as well. hotfix? use a specific super, like super(4)

//public class Seal extends Mammal {
//    public Seal() {
//        super(4);
//    }
//}                     //this will work now, but I commented it so I don't move it