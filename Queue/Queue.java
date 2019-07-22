package Queue;

class Queue<T> implements QueueInterface<T>{
	private T data[];
	private int front, back, size, capacity; 

	Queue() {
		capacity = 1000;
		data = (T[]) new Object[capacity];
		front = back = size = 0;
	}

	Queue(int c) {
		capacity = c;
		data = (T[]) new Object[capacity];
		front = back = size = 0;
	}

	public String toString() {
		int i, j;
		StringBuilder ans = new StringBuilder();
		ans.append("Queue:  ");
		for (i = 0, j = front; i < size; i++, j++) {
			if (j == capacity)
				j = 0;
			ans.append(data[j] + " -> ");
		}
		return ans.toString();
	}


	public void enqueue(T x) {

		if(size<capacity) {
			data[back] = x; 
			back++; 
			size++; 		
			if(back%(capacity)==0) {
				back =  back % (capacity); 
			}
			return; 
		}
		System.out.println("Queue is full");
	}

	public T dequeue() {
		if(size>0) {
			int temp = front; 
			front++; 
			if(front%(capacity)==0) {
				front = front%(capacity); 
			}
			size--; 
			return data[temp];
		}
		return (T)"Queue is empty";
	}

	public T peek() {
		if(size!=0) {
			return data[front]; 
		}
		return null; 
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
}