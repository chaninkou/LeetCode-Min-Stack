package stack;

import java.util.Stack;

public class MinStack {
    int min = Integer.MAX_VALUE;

    Stack<Integer> stack = new Stack<>();
  
    // Reason why we push twice is so we could keep track of min and second min
    public void push(int x) {
        // If the value is less than min, then push the min first and then push the value
        if(x <= min){
        	// Push the previous min
        	stack.push(min);
        	
        	// Min will now equal to current min
        	min = x;
        }
        
        // Push the current min
        stack.push(x);
    }
    
    public void pop() {
        // If pop is min, then pop again to get the second min.
    	if(stack.pop() == min){
    		// The min will be the second min now
    		min = stack.pop();
    	}
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
