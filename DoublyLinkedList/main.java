package DoublyLinkedList;

public class main {

	public static void main(String[] args) {

		DLL dll = new DLL<>(); 

		dll.AddAfterHead(1);

		dll.AddAfterHead(2);

		dll.AddAfterHead(3);

		dll.AddBeforeTail(0);
		
		dll.AddAfterHead(5);

		dll.print();


		dll.delete(2);
		dll.delete(5);

		//dll.size();



	}

}
