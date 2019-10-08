package stack;

public class Main {
	public static void main(String[] args) {
		 MinStack obj = new MinStack();
		 
		 obj.push(-2);
		 
		 obj.push(0);
		 
		 obj.push(-3);
		 
		 System.out.println("min: " + obj.getMin());   
		 
		 obj.pop();
		 
		 System.out.println("top: " + obj.top()); 
		 
		 System.out.println("min: " + obj.getMin());  
	}
}
