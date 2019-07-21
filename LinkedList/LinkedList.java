package LinkedList;

public class LinkedList {
	
	Node head; 
	//Node tail; 
	int size; 
	
	public LinkedList(){
		head = null; 
		size = 0;
	}
	
	public void add(int a) { //adding it right after the head
		
		if(head==null) {
			Node temp  = new Node(a, null); 
			//temp = head; 
			head = temp; 
			size++;
		}
		else {
		System.out.println("Head not null"); 
		Node temp  = new Node(a, head); 
		head = temp; 
		size++; 
		}

	}
	
	public int getSize() {
		return size;
	}
	

	public void  toPrint() {
		String a = "-->"; 
		
		Node temp = head;
		
		while(temp!=null) {

			a = a+temp.getData()+" -->"; 
			temp = temp.getNext(); 
		}
		
		System.out.println(a);
		
		
		
	}
	

}
