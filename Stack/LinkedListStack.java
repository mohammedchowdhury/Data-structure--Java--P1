package Stack;

public class LinkedListStack<T>{
	
	private Node<T> head;
	int size; 
	
	
	
	public LinkedListStack(){
		//head = null; 
		size = 0; 
	}
	
	public void push(T data) {
		Node<T> newNode = new Node<T>(data); 
		newNode.setNext(head);
		newNode = head; 
		
	}
	
//	public T pop() {
//		T data = head.getData(); 		
//		Node<T> temp = head.getNext(); 		
//		head.setNext(null);
//		temp = head; 
//		return data; 
//
//	}
	
	public void peek() {
		
		Node<T> temp = head; 
		String a = "-->"; 
		while(temp!=null) {
			
			a = a+temp.getData()+"-->"; 
		}
		System.out.println(a);
	}
	


}
