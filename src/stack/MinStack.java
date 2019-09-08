package stack;

import java.util.Stack;

public class MinStack {
    int min = Integer.MAX_VALUE;

    Stack<Integer> stack = new Stack<>();
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        // If the value is less than min, then push the min first and then push the value
        if(x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        // If pop is min, then pop again to get the second min.
        if(stack.pop() == min){
            min = stack.pop();
            System.out.println(min);
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
