package chapter_6_CLASS_DESIGN.hidingStaticMethods;

public class Merkeet extends Carnivore {
    protected boolean hasFur = true;

    public static void main(String[] args) {
        Merkeet m = new Merkeet();
        Carnivore c = m;
        System.out.println(m.hasFur);       // this is true
        System.out.println(c.hasFur);     // this is false
    }
}
