package array;

import java.util.Random;

public class UseOfRandom1 {
    public static void main(String[] args) {

        int [] list = new int[5];

        Random random = new Random();

        for(int j=0; j<list.length;j++) {
            list[j] = random.nextInt(100); //if no boundary
            System.out.println(list[j]);
        }

    }

}


