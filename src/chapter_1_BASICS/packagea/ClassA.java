package chapter_1_BASICS.packagea;

public class ClassA {}

/*
We use one of the following three commands to point the way to the .class extensions that the .java files can find
java -cp classes packageb.ClassB
java -classpath classes packageb.ClassB
java --class-path classes packageb.ClassB

we used this line of code to create them (from the src file in the cmd):

javac -d classes_HERE chapter_1/packagea/ClassA.java chapter_1/packageb/ClassB.java

The "-d" means we are directing in which directory we are taking the generated class files


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