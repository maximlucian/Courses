package chapter_1_BASICS.packageb;

import chapter_1_BASICS.packagea.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("Got it");
    }
}

/*
We use one of the following three commands to point the way to the .class extensions that the .java files can find
java -cp classes packageb.ClassB
java -classpath classes packageb.ClassB
java --class-path classes packageb.ClassB

we used this line of code to create them (from the src file in the cmd):

javac -d classes_HERE chapter_1/packagea/ClassA.java chapter_1/packageb/ClassB.java


WE CREATE THIS HIERARCHY:

 ├── chapter_1
 │    ├── packagea
 │    │    └── ClassA.java
 │    └── packageb
 │         └── ClassB.java
 └── classes
       ├── packagea
       │    └── ClassA.class
       └── packageb
            └── ClassB.class

 */

//Up next: Meerkat.java