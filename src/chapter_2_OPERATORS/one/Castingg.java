package chapter_2_OPERATORS.one;

public class Castingg {
    public static void main(String[] args) {
        int fur = (int)5;    //you can do the same datatype why not
        int hair = (short) 2;
        String type = (String)  "Bird";
        short tail = (short)(4 + 10);
//        long feathers = 10(long);  this will not compile because you CANNOT cast from SMALL TO BIG

//                          !!!! IMPORTANT  !!!!!!

//        long reptile = (long)192301398193810323;  this will not compile because long is first interpreted as INT
//                                                      thus the code will think that you are casting from int to long (bigger)

        short bird = (short)1921222;  // Stored as 20678 due to OVERFLOW (number too big, we restart from the smallest negative value)


        System.out.print(2147483647+1);  // -2147483648 FUN FACT this is also an overflow. cool huh?


        short mouse = 10;
        short hamster = 3;
//        short capybara = mouse * hamster;  DOES NOT COMPILE due to the fact java thinks you want to go to a bigger value (int)
        short capybara = (short)(mouse * hamster); //hotfix problema de mai sus
//        short capybara = (short)mouse * hamster;   ASA NU. paranteze prietene alo
    }
}
