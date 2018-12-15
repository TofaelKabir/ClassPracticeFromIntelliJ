package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class UseOfQueue2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("SD"); //head
        queue.add("NC");
        queue.add("WA");
        queue.add("OR");
        queue.add("FL");
        queue.add("CA");  //tail

        if (queue.peek().equalsIgnoreCase("SD")) {//if we don't peak NY, AND CHOOSE ANOTHER STATE OUTPUT IS ZERO
            System.out.println(queue.poll());
        }
    }
}