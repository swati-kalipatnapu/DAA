package DifficultPrograms;

public class NodeTree {
	NodeTree root;
	NodeTree left;
	NodeTree right;
	int data;
	public NodeTree(int data) {
		//root = null;
		this.data = data;
		//right = null;
		//left = null;
		root = null;
		left = null;
		right = null;
	}
	public NodeTree() {
		// TODO Auto-generated constructor stub
	}
	public void display(int data) {
		System.out.println(data+" ");
	}
		
}
