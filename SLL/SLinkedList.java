package SLL;

class SLinkedList<T> implements List<T>{
	private Node<T> head, tail;
	private int size;

	SLinkedList(){
		head = tail = null;
		size = 0;
	}

	SLinkedList(Node<T> first){
		head = tail = first;
		size = 1;
	}

	public Node<T> getHead(){
		return head;
	}

	public Node<T> getTail(){
		return tail;
	}

	public void setHead(Node<T> head){
		this.head = head;
	}

	public void setTail(Node<T> tail){
		this.tail = tail;
	}

	public void append(T x){ //done 
		addLast(x);
	}
	public void addLast(T x){ 
		Node<T> newNode = new Node<>(x);
		if(head == null) {
			tail = head = newNode; 
			return; 
		}
		else {
			tail.setNext(newNode);
			tail = newNode; 
		}
		size++; 
	}

	public void remove(T target){
		Node<T> location = get(target);
		remove(location);
	}
	public void remove(Node<T> target){

		if(target==null) {
			return; 
		}
		else if(target==head) {
			head = head.getNext(); 
			size--; 
			return; 
		}
		else if(target==tail) {
			Node<T> temp = head; 
			while(temp.getNext()!=tail) {
				temp = temp.getNext(); 
			}
			temp.setNext(null);
			tail = temp; 
			size--; 
			return; 
		}
		else {
			Node<T> temp = head; 
			while(temp.getNext()!=target) {
				temp = temp.getNext(); 
			}
			temp.setNext(temp.getNext().getNext()); 
			size--; 
			return; 
		}
	}

	public Node<T> get(T target){
		Node<T>trav = head;
		while(trav!=null){
			if(trav.getData() == target){
				return trav;
			}
			trav = trav.getNext(); 
		}
		return null;
	}

	public void set(T old, T replace){
		Node<T> oldNode = get(old); 
		if(oldNode==null) {
			Node<T> replaceNode = new Node<>(replace); 
			tail.setNext(replaceNode);
			tail = tail.getNext(); 
		}
		else {
			oldNode.setData(replace);
		}
	}

	public String toString(){
		StringBuilder ans = new StringBuilder();
		Node<T> trav = head;
		while(trav!=null){
			ans.append(trav.toString() + "->");
			trav = trav.getNext();
		}
		ans.append("NULL");
		return ans.toString();

	}
}