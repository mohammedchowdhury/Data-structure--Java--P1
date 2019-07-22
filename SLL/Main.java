package SLL;

class Main {
	public static <T> void main(String[] args) {
		SLinkedList<Integer> list = new SLinkedList<>();

		list.append(5);
		list.append(4);
		list.append(8);
		list.append(9);

		Node<Integer> t =  list.get(8);

		System.out.println(t);
		list.remove(8);
		System.out.println(list);
		System.out.println(list.get(6));
		list.set(11, 10);
		System.out.println(list);
	}
}


//A) Complete the Singly Linked List data structure. Make sure the that each method in the List interface is implemented. As well that the data structure is robust.
//a. There are errors right now. It is throwing a null pointer exception when the main function is ran. Find where is that error occurring and fix it.
//b. Finish the remove(Node target) method
//c. Complete the set method. This method takes in two nodes as the params, old and replace. Find the old
//node in the list and replace that node with the replace node. If the old node is not in the list, then just
//add the replace node onto the back of the list.