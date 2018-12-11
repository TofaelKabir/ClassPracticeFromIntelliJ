package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "/Users/mohammadsharkar/Desktop/kamal/tofael.txt";

        FileReader fr = new FileReader(path);
        System.out.println("FileReader find the following path: "+path);
    }
}
