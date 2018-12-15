package stack;

import java.util.Iterator;
import java.util.Stack;

public class UseOfStack5 {
    public static void main(String[] args) {
        Stack <String> stack = new Stack();
        stack.add("SD"); //bottom
        stack.add("NC");
        stack.add("OR");
        stack.add("CA"); //top

//        while(!stack.empty()){
//        System.out.println(stack.pop());
//    }
        /*for(String string :stack){
            System.out.println(string);
        }*/
        Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
