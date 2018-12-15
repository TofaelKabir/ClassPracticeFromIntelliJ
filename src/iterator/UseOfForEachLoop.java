package iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseOfForEachLoop {
    public static void main(String[] args) {
        List<String> stList = new ArrayList<String>();
        stList.add("NY");
        stList.add("SC");
        stList.add("CA");
        stList.add("PA");

        for(String state : stList){
            System.out.println(state);
        }
    }
}