package stack;

import java.util.Stack;

public class UseOfStack1 {
    public static void main(String[] args) {
        Stack <String> stack = new Stack();   //Stack is a class

        stack.add(""); //bottom, first
        stack.add("NC");
        stack.add("OR");
        stack.add("CA");  //top, last

        System.out.println(stack.peek());  // Looks at the object at the top of this stack without
                                            // removing it from the stack.
        System.out.println(stack.pop()); // Removes the object at the top of this stack and
                                        // returns that object as the value of this function.,
                                       // POP remove the item from the stack first, last in first out
        System.out.println(stack.push("SC"));  //Pushes an item onto the top of this stack.
        System.out.println(stack.search("NC")); //Returns the 1-based position where an object is
                                                  // on this stack., TO FIND THE INDEX NUMBER WHERE IT IS DECLARED
        System.out.println(stack.search("SN"));  //IF ABSENT IT SAYS -1
        System.out.println(stack.search("NP")); //IF ABSENT IT SAYS -1
        System.out.println(stack.empty());        //Tests if this stack is empty. //WHY?
    }
}
