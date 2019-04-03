
public class BST<T extends Comparable<T>> {
	
	private Node<T> root;
	
	public BST() {
		root = null;
		
	}
	
	public boolean find(T value) {
		return find(root, value);
	}
	
	private boolean find(Node<T> root, T value) {
		if (root == null) {
			return false;
		}
		
		if (value.compareTo(root.data) == 0) {
			return true;
		}
		
		if (value.compareTo(root.data) < 0) {
			return find(root.left, value);
		} else {
			return find(root.right, value);
		}		
	}
	
	public void insert(T value) {
		root = insert(this.root, value);
	}
	
	private Node<T> insert(Node<T> root, T value) {
		if (root == null) {
			root = new Node<T>(value);
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
