package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue4 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("SD"); //head
        queue.add("NC");
        queue.add("WA");
        queue.add("OR");
        queue.add("FL");
        queue.add("CA");  //tail

        /*while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }*/     //shift command / pr command /

        Iterator iterator = queue.iterator(); //Iterator traverse through the linked list
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}