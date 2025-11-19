package chapter_5_METHODS.staticExplained;

public class FirstExample {
    public static class Penguin {       //Penguin has to be static due to the fact it belongs to the FirstExample class
        String name;
        static String nameOfTallestPenguin;
    }

    public static void main(String[] unused) {
        var p1 = new Penguin();
        p1.name = "Lilly";
        p1.nameOfTallestPenguin = "Lilly";
        var p2 = new Penguin();
        p2.name = "Willy";
        p2.nameOfTallestPenguin = "Willy";

        System.out.println(p1.name);                  //here we have Lilly
        System.out.println(p1.nameOfTallestPenguin);
        System.out.println(p2.name);                        //all of these 3 will be Willy
        System.out.println(p2.nameOfTallestPenguin);    //this is due to the fact the field "nameOfTallesPenguin" is static
    }                                           //while "name" belongs to each object in particular
}                                           //the field "nameOf..." is static, meaning it belongs to the "Penguin" class
                                                    //so there is ONLY 1 PARTICULAR STATIC FIELD THAT BELONGS EXCLUSIVELY TO THE CLASS