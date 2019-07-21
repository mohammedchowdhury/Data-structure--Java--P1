package DoublyLinkedList;

public class DLL<T> {

	private Node<T> header, trailer; 
	private int size; 

	DLL(){
		header = new Node<>(); 
		trailer = new Node<>(); 
		trailer.setPrevious(header);
		header.setNext(trailer);
	}

	public void AddAfterHead(T data) {
		Node<T> newNode = new Node<T>(data); 

		newNode.setNext(header.next);
		newNode.setPrevious(header);

		header.setNext(newNode);
		newNode.next.setPrevious(newNode);	
		size++; 
	}

	public void AddBeforeTail(T data) {
		Node<T> newNode =  new Node<T>(data); 
		newNode.setNext(trailer);
		newNode.setPrevious(trailer.previous);

		trailer.previous.setNext(newNode);
		trailer.setPrevious(newNode);

		size++;
	}

	public void delete(int a) {
		Node<T> temp = header; 

		temp = temp.next; 

		while(temp!=null) {	

			if((Integer)temp.getData()==a) {

				System.out.println(((Integer)temp.getData()));
				Node temp1 = temp; 
				temp.previous.setNext(temp1.next);
				temp.next.setPrevious(temp1.previous);		
				temp.setNext(null);
				temp.setPrevious(null);		
				break; 		
			}
			temp = temp.next; 	
		}
		print();
	}


	public void print() {
		Node<T> temp = header; 
		String a = "-->"; 

		while(temp!=null) {
			a = a+temp.data+"-->"; 
			temp = temp.next; 
		}
		System.out.println(a);
	}

	public void size() {
		print(size+""); 	
	}

	public void print(String a) {
		System.out.println(a);
	}



}
