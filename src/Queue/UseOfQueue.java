package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue {
    public static void main(String[] args) {


        Queue<String>queue = new LinkedList<String>();   //Queue is a interface
        queue.add("SD"); //head , first
        queue.add("NC");
        queue.add("WA");
        queue.add("OR");
        queue.add("FL");
        queue.add("CA");  //tail , last

        System.out.println(queue.peek());//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println(queue.add("NM")); //Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
        System.out.println(queue.poll()+"\n");    //Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println(queue.remove()+"\n"); //Retrieves and removes the head of this queue.
        System.out.println(queue.element()); //retrieves but doesn't remove the head of the queue, INTERESTING, SEE LINE 18
    }
}
