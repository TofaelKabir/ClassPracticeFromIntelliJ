package dataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseOfLinkedList1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("SC");
        list.add("CA");
        list.add("PA");

        Iterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
