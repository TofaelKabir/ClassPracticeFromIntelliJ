package reader;

import java.io.File;
import java.util.Scanner;

public class MakingAFolder {
    public static void main(String[] args) {
        File folder = new File("/Users/mohammadsharkar/Desktop/kamal");
        folder.mkdir();
        if (folder.exists()) {
            System.out.println(folder.getName() + " is created");
            File file = new File("/Users/mohammadsharkar/Desktop/kamal/tofael.txt");
            try {
                file.createNewFile();
            } catch (Exception ex) {
                System.out.println("the error is :" + ex);
            }
        if (file.exists()){
            System.out.println(file.getName()+ " is created");
            Scanner sc = new Scanner(System.in);
        }
        }
    }
}
//not done it
//got it from Mehedi bhai