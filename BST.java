
/**
 * Binary search tree class
 * 
 * @param <T> type of data
 */
public class BST<T extends Comparable<T>> {
	
	/* Pointer to the root of the tree */
	private Node<T> root;
	
	/*
	 * Constructor creates an empty tree
	 */
	public BST() {
		root = null;
	}
	
	/*
	 * Returns true if the value is in the tree, false if it is not. Starts the 
	 * search by calling a recursive find function on the root of the tree.
	 */
	public boolean find(T value) {
		return find(root, value);
	}
	
	/*
	 * Recursive function starts at the root node and searches down the tree. 
	 * Returns false when a null node is found (value not in tree), and true 
	 * if the value is in the tree.
	 */
	private boolean find(Node<T> root, T value) {
		if (root == null) {
			return false;
		}
		
		if (value.compareTo(root.getData()) == 0) {
			return true;
		}
		
		if (value.compareTo(root.getData()) < 0) {
			return find(root.left, value);
		} else {
			return find(root.right, value);
		}		
	}
	
	/*
	 * Inserts the value into the tree by passing the root to the 
	 * recursive insert function.
	 */
	public void insert(T value) {
		root = insert(this.root, value);
	}
	
	/*
	 * Recursive function starts at the root node and searches down the tree for 
	 * the position in which the value should be inserted and creates a new node. 
	 */
	private Node<T> insert(Node<T> root, T value) {
		if (root == null) {
			return new Node<T>(value);
		}
		
		if (value.compareTo(root.getData()) < 0) {
			root.left = insert(root.left, value);
		} else if (value.compareTo(root.getData()) > 0) {
			root.right = insert(root.right, value);
		}
		
		return root;
	}
	
	/*
	 * Deletes the node with the given value in the tree if it exists.
	 * Passes the root to the recursive delete function.
	 */
	public void delete(T value) {
		root = delete(this.root, value);
	}
	
	/*
	 * Recursive function starts at the root node and searches down the tree for
	 * a node with the given value. If found, deletes the node depending on how 
	 * children it has.
	 */
	private Node<T> delete(Node<T> root, T value) {
		if (root == null) {
			return null;
		}
		
		if (value.compareTo(root.getData()) == 0) {
			
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} 
			
			root.setData(findSmallestChild(root.right)); 
			delete(root.right, root.getData());
		}
		
		if (value.compareTo(root.getData()) < 0) {
			root.left = delete(root.left, value);
		} else {
			root.right = delete(root.right, value);
		}
		
		return root;
	}
	
	/*
	 * Returns the data of the smallest child of a node.
	 */
	private T findSmallestChild(Node<T> root) {
		T min = root.getData();
		
		while (root.left != null) {
			if (root.left.getData().compareTo(min) < 0) {
				min = root.left.getData();
				root = root.left;
			}
		}
		
		return min;
	}
	
	/*
	 * Calls the recursive print function to print the tree in ascending order.
	 */
	public void print() {
		print(this.root);
	}
	
	/*
	 * Recursive function calls print on left child, prints the data in the node,
	 * then calls print on the right child.  
	 */
	private void print(Node<T> root) {
		if (root != null) {
			print(root.left);
			System.out.println(root.getData());
			print(root.right);
		}
	}
}
