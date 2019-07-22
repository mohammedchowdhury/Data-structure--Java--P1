package SLL;

class Node<T>{
	private T data;
	private Node<T> next;

	Node(){
		data = null;
		next = null;
	}

	Node(T data){
		this.data = data;
		next = null;
	}

	Node(T data, Node<T> next){
		this.data = data;
		this.next = next;
	}

	public void setData(T data){
		this.data = data;
	}

	public void setNext(Node<T> next){
		this.next = next;
	}

	public T getData(){
		return data;
	}

	public Node<T> getNext(){
		return next;
	}

	@Override
	public String toString(){
		return String.format(""+data);
	}
}