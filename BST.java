
public class BST<T> {
	
	private Node<T> root;
	
	public BST() {
		root = null;
		
	}
	
	public boolean find(Comparable<T> value) {
		
		return false;
		
	}
	
	public void insert(Comparable<T> value) {
		root = insert(root, value);
	}
	
	public Node<T> insert(Node<T> root, Comparable<T> value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		
		if (value.compareTo(root.data) < 0) {
			root.left = insert(root.left, value);
		} else if (value.compareTo(root.data) > 0) {
			root.right = insert(root.right, value);
		}
		
		return root;
	}
	
	public void delete(Comparable<T> value) {
		
	}
	
	public void print() {
		
	}
	
}
