package array;

import java.util.Random;

public class UseOfRandom2 {
    public static void main(String[] args) {
        int [] list = new int[5];
        Random random = new Random();
        int input = random.nextInt();
        System.out.println("Randomly chosen number: "+input);
    }
}


