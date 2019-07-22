package Stack;

public interface List<T>{
	public void append(T x);
	public void remove(T target);
	public Node<T> get(T x);
	public void set(T old, T replace);
}