package useOfSuper;

public class TestFamily {
    public static void main(String[] args) {
        Daddy dy = new Daddy();  //what happen daddy is an abstract class, abstract can't instantiate itself
        dy.eye();

        //Daddy dy2 = new Daddy("Sharkar");

        Tofael m1 = new Tofael();
        m1.alive();

        Tofazzal m2 = new Tofazzal();
        m2.eye();
        m2.age();
        m2.CarryingFamilyName();
        m2.familyStatus();
    }
}