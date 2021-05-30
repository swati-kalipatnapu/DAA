package moderateProgram;

public class BinarySearchTree {
	public static void main(String[] args) {
		Node n = new Node(10);
		n.add(3);
		n.add(11);
		n.add(2);
		n.add(15);
		System.out.println(n.contains(12).data);
	}
	
}

class Node{
	Node root;
	Node left;
	Node right;
	int data;
	public Node(int data) {
		root= null;
		left = null;
		right = null;
		this.data = data;
	}
	//using recursion
	public void add(int data) {
		
		/*
		 * if(root == null) { root = new Node(data); } else
		 */ if(data < this.data && this.left != null) {
			this.left.add(data);
		}
		else if(data < this.data) {
			this.left = new Node(data);
		}
		else if(data > this.data && this.right != null) {
			this.right.add(data);
			
		}
		else if(data > this.data) {
			this.right = new Node(data);
		}
		
	}
	public Node contains(int data) {
		if(this.data == data) {
			return this;
		}
		if(data <= this.data && this.left != null) {
			return this.left.contains(data);
			
		}
		else if(data > this.data && this.right !=null) {
			return this.right.contains(data);
			
		}
		return null;
	}
	public boolean validate(Node node,Node min,Node max) {
		 
		if(max != null && node.data > max.data) {
			return false;
		}
		if(min != null && node.data < min.data) {
			return false;
			
		}
		if(node.left != null && !validate(node.left,min,node)) {
			return false;
		}
		if(node.right != null && !validate(node.right,node,max)) {
			return false;
		}
		return true;
	}
		
}