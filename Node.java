
/**
 * A binary search tree node
 *
 * @param <T> type of data
 */
public class Node<T extends Comparable<T>> {
	
	private T data;
	
	/* Pointer to the left node */
	public Node<T> left;
	
	/* Pointer to the right node*/
	public Node<T> right;
	
	/*
	 * Constructor sets the data
	 */
	public Node(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	/*
	 * Returns the data
	 */
	public T getData() {
		return this.data;
	}
	
	/*
	 * Sets the data to the given value
	 */
	public void setData(T value) {
		this.data = value;
	}
}
