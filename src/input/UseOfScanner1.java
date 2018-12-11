package input;

import java.util.Scanner;

public class UseOfScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some integer value: ");
        int input=0;
        input=sc.nextInt();
        sc.close();
        System.out.println("you put the value of "+input);

    }
}
