package DLL;

class Main {
	public static void main(String[] args) {
		DLinkedList<Integer> list = new DLinkedList<>();
		list.append(5);
		list.append(4);
		list.append(8);
		list.append(9);
	
		DNode<Integer> t = list.get(0);
		System.out.println(t);
		list.remove(66);
		list.set(11, 11);
		System.out.println(list);
	}
}

//B) Complete the Doubly Linked List data structure. Implement the List interface. None of the methods in the
//interface is currently implemented