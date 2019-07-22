package DLL;

class DLinkedList<T> implements List<T>{
	private DNode<T> header, trailer;
	private int size;

	DLinkedList(){
		header = new DNode<T>();
		trailer = new DNode<T>(null, null, header);
		header.setNext(trailer);
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}    

	public String toString(){
		StringBuilder ans = new StringBuilder();
		DNode<T> trav = header;
		ans.append("Header <--> ");
		trav = trav.getNext();
		while(trav!=trailer){
			ans.append(trav.toString() + " <--> ");
			trav = trav.getNext();
		}
		ans.append("Trailer");
		return ans.toString();
	}
	public void append(T x) { //adding to header
		DNode<T> tempNode = new DNode<T>(x,header.getNext(),header);  
		header.setNext(tempNode);
		tempNode.getNext().setPrev(tempNode);
		size++; 
	}

	public void remove(T target) {
		DNode<T> temp = get(target); 
		if(temp==null) {
			return; 
		}
		else {
			temp.getPrev().setNext(temp.getNext());
			temp.getNext().setPrev(temp.getPrev());
		}
	}

	public DNode<T> get(T x) {
		DNode<T> temp = header; 
		while(temp!=trailer) {
			if(temp.getData()==x) {
				return temp; 
			}
			temp = temp.getNext(); 
		}
		return null;
	}
	
	public void set(T old, T replace) {	
		DNode<T> oldNode = get(old); 
		if(oldNode==null) {
			DNode<T> newNode = new DNode<>(replace,trailer,trailer.getPrev()); 
			trailer.getPrev().setNext(newNode);
			trailer.setPrev(newNode);
			size++; 
			return; 
		}
		oldNode.setData(replace);
	}
}