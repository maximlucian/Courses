package chapter_6_CLASS_DESIGN.protectedNoBrainer;

public class Spider {
    public void printDetails() {
//        System.out.println(size);  //size is protected
    }                   //because Spider doesn't EXTEND BigCat it has to create an object then reference it
}                               //BigCat cat = new BigCat();
                                    //sout(cat.size);