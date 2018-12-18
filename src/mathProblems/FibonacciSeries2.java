package mathProblems;

import java.util.Arrays;

public class FibonacciSeries2 {
    public static void main(String[] args) {
        int [] fibo = new int[5];
        for (int i = 0; i < 5; i++) {
            if(i<2) {
                fibo[i] = i;
            }else{
                fibo[i] = fibo [i-2]+ fibo[i-1];
            }
        }
        System.out.println(Arrays.toString(fibo));
    }
}