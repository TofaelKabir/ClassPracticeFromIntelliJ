package array;

import java.util.Scanner;

public class UseArray4 {
    public static void main(String[] args) {
        int [] list = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some integer value: ");

        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
            System.out.println(list[i]);
        }
        //System.out.println(list[3]);
        sc.close();
    }
}

