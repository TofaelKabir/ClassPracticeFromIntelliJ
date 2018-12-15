package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseOfIterator {
    public static void main(String[] args) {
        List<String> stList = new ArrayList<String>();
        stList.add("NY");
        stList.add("SC");
        stList.add("CA");
        stList.add("PA");

        Iterator it = stList.listIterator();

        /*it.hasNext();
        System.out.println(it.next());*/  //print only one

        while ((it.hasNext())){
            System.out.println(it.next());
        }
    }
}