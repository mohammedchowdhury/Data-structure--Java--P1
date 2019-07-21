package DoublyLinkedList;

public class Node<T>{
	Node<T> next; 
	Node<T> previous; 
	T data;

	Node(){
		next = null; 
		previous  = null; 
		data = null; 
	}
	
	Node(T data){
		this.data = data; 
		next = null; 
		previous = null; 
	}
	
	public void setNext(Node<T> nextNode) {
		next = nextNode;
	}
	
	public void setPrevious(Node<T> previousNode) {
		this.previous = previousNode; 
	}
	
	public T getData() {
		return this.data; 
	}


}
