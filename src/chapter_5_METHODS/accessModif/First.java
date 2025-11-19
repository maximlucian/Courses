package chapter_5_METHODS.accessModif;

public class First {
        public void skip1() {}

//        default void skip2() {} // DOES NOT COMPILE
//        void public skip3() {}  // DOES NOT COMPILE

        void skip4() {}
  public void bike1() {}
    public final void bike2() {}
    public static final void bike3() {}
    public final static void bike4() {}

//    public modifier void bike5() {}       // DOES NOT COMPILE
//    public void final bike6() {}          // DOES NOT COMPILE
//    final public void bike7() {}
}
