package chapter_5_METHODS.accessModif;

public class TypesOfAccess {

    public static class InnerClass {

        private int privateBefore = 3;    //only accessible in this class (InnerClass)
        int nothingBefore = 3;          //accessible in accessModif Package
        protected int protectedBefore = 3;      //Accessible in this package and in subclasses from other packages
        public int publicBefore = 3;        //Accessible anywhere

        private void number() {
            System.out.println(privateBefore);      //ALLOWED (within InnerClass)
        }
    }

}

