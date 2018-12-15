package stack;

import java.util.Stack;

public class UseOfStack3 {
    public static void main(String[] args) {
        Stack <String> stack = new Stack();
        stack.add("SD"); //bottom
        stack.add("NC");
        stack.add("OR");
        stack.add("CA"); //top

        while(!stack.empty()){
        System.out.println(stack.pop());
    }
  }
}
