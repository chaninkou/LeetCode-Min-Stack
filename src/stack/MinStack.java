package stack;

import java.util.Stack;

public class MinStack {
	int min = Integer.MAX_VALUE;
	
	Stack<Integer> stack = new Stack<>();
  
    // Reason why we push twice is so we could keep track of min and second min
    public void push(int x) {
    	// We want equal to because we need to know which one is the second min also
    	if(x <= min){
    		// Push the second min, cause we want to know what is the second min once we pop the first min
    		stack.add(min);
    		
    		// Update the current min
    		min = x;
    	}
    	
    	// Finally push the value, even if its not min
    	stack.push(x);
    }
    
    // For pop(), we gotta make sure we update the min value if we popped the min value
    public void pop() {
    	// stack.pop() inside if statement will occur no matter what, then update the current min by popping the second min that was used as a temp
    	if(stack.pop() == min){
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
