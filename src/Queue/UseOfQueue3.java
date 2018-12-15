package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("SD"); //head
        queue.add("NC");
        queue.add("WA");
        queue.add("OR");
        queue.add("FL");
        queue.add("CA");  //tail

        while(!queue.isEmpty()){  //using while as long as linkedlist is not empt
            System.out.println(queue.poll());
        }
    }
}