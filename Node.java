
public class Node<T> {
	
	private T data;
	private Node<T> left;
	private Node<T> right;
	
	public Node(T data) {
		this.data = data;
		left = null;
		right = null;
	}

}
