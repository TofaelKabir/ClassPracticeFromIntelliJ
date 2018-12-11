package input;

import java.util.Scanner;

public class UseOfScanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some integer value: ");

        int input =11;
        while(input>10) {
            input= sc.nextInt();
            input--;
        }
        System.out.println("you put the value of "+input);

    }
}
//not working