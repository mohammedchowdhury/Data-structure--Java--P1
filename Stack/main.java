package Stack;

public class Main {

	public static void main(String[] args) {
		
		LinkedStack<Integer> stack = new LinkedStack<>(); 
		stack.push(6);
		stack.push(5);
		stack.push(4);
		System.out.println(stack.pop()); 
		System.out.println(stack.pop()); 
		System.out.println(stack.pop()); 
		System.out.println(stack.peek()); 
		
		

	}

}
