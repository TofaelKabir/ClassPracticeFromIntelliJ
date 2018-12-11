package array;

import java.util.Scanner;

public class UseArray5 {
    public static void main(String[] args) {
        int [] list = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some integer value: ");

        for(int j=0; j<list.length;j++) {
            list[j] = sc.nextInt();
        }
        for(int i=0; i<list.length;i++){
            System.out.println(list[i]);
        }
        sc.close();
    }
}

