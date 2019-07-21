package Stack;

public class Node<T> {

	private T data; 
	private Node <T> next; 
	
	Node(T data){
		this.data = data; 
		next = null; 
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public void setNext(Node<T> nextNode) {
		this.next = nextNode;
	}
	
	public T getData() {
		return data; 
	}
	public Node<T> getNext() {
		return next; 
	}	
	
	
	
}
