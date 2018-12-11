package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile3 {
    public static void main(String[] args) {

        String path = "/Users/mohammadsharkar/Desktop/kamal/tofael.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            System.out.println("FileReader find the following path: " + path);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("We couldn't find the file");
        }
        String data = "";
        try {
            br = new BufferedReader(fr);
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
            }catch(IOException e){
            //e.printStackTrace();
            System.out.println("We couldn't find the file");
        }
        finally {
            if(fr != null){
                fr=null;
            }
            if(br !=null){
                br=null;
            }
        }
    }
}

//buffered reader