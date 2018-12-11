package enumerationPractice;

public class TestSize {
    public static void main(String[] args) {
        Macys mc = new Macys();

        Macys mc1 = new Macys(Size.XXXL);
        mc1.whatSizeYouAreLookingFor();
        Macys mc2 = new Macys(Size.Medium);
        mc2.whatSizeYouAreLookingFor();
    }




}
