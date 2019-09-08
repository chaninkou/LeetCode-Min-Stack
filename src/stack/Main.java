package stack;

public class Main {
	public static void main(String[] args) {
		 MinStack obj = new MinStack();
		 obj.push(-2);
		 obj.push(0);
		 obj.push(-3);
		 int param_3 = obj.top();
		 int param_4 = obj.getMin();
		 
		 System.out.println("top: " + param_3);
		 System.out.println("min: " + param_4);
	}
}
