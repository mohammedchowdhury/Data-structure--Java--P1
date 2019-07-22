package Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> stack = new Queue<>(4); 
		stack.enqueue(0);
		stack.enqueue(1);
		stack.enqueue(2);
		stack.enqueue(3);
		
		System.out.println(stack);
		
		System.out.println(stack.dequeue()); 

		stack.enqueue(4);
		
		stack.dequeue();
		stack.enqueue(5);
		System.out.println(stack);

	}

}
