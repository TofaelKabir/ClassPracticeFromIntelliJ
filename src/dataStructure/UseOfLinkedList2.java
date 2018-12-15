package dataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseOfLinkedList2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("\nNY");
        list.add("SC");
        list.add("CA");
        list.add("PA\n");

        Iterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        list.remove("CA");
        System.out.println("After removing node\n");
        it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
