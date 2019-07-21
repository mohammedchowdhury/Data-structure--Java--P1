package LinkedList;

public class Node {
	
	private Node next; 
	private int data; 
	
	public Node(int data, Node next) {
		this.next = next; 
		this.data = data;
	}
	
	public int getData() {
		return data; 
	}
	
	public Node getNext() {
		return next; 
	}
	
	public void setNext(Node node) {
		next = node; 
		
	}
	
	
}
