package Stack;

class LinkedStack<T> implements StackInterface<T>{
	private SLinkedList<T> stack;
	private int size; 

	LinkedStack(){
		stack = new SLinkedList<>();
		size = 0;
	}

	public T pop() {
		if(size()!=0) {
			size--; 
			return stack.remove(stack.getHead()).getData(); 
		}
		return (T) "Stack Empty"; 
	}

	public void push(T x) {
		Node<T> newNode  = new Node<>(x); 
		stack.setHead(newNode);
		size++; 
	}

	public T peek() {
		if(size!=0) {
			return stack.getHead().getData();
		}
		return (T) "Stack Empty"; 
	}

	public int size() {		
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}
}