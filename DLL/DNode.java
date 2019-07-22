package DLL;

class DNode<T>{
	private T data;
	private DNode<T> next;
	private DNode<T> prev;

	DNode(){
		data = null;
		next = prev = null;
	}

	DNode(T data){
		this.data = data;
		next = prev = null;
	}

	DNode(T data, DNode<T> next, DNode<T> prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public void setData(T data){
		this.data = data;
	}

	public void setNext(DNode<T> next){
		this.next = next;
	}

	public void setPrev(DNode<T> prev){
		this.prev = prev;
	}

	public T getData(){
		return data;
	}

	public DNode<T> getNext(){
		return next;
	}

	public DNode<T> getPrev(){
		return prev;
	}

	@Override
	public String toString(){
		return String.format(""+data);
	}
}