package input;

import java.util.Scanner;

public class UseOfScanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some integer value: ");
        int input;
        input =sc.nextInt();
        int total = input+input;
        //int input = sc.nextInt();
        System.out.println("Total value is "+total);

    }
}
