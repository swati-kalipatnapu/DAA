package DifficultPrograms;
/*import java.util.ArrayList;
import java.util.Collection;
import java.util.List;*/

import java.util.LinkedList;
import java.util.Queue;
import DifficultPrograms.NodeTree;
public class Trees {
	
	
	public Trees() {
		
	}
	public static void main(String[] args) {
		Trees tr = new Trees();
	
	}
	public void levelorderTraversal(NodeTree root) {
		if (root == null) {
			return;
		}

		Queue<NodeTree> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			NodeTree node = queue.remove();
			System.out.print(node.data + " ");

			if (node.left != null) {
				queue.add(node.left);
			}

			if (node.right != null) {
				queue.add(node.right);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * Trees value; NodeTree root; NodeTree right; NodeTree left; private
	 * List<Trees> children; int maxSize; public Trees() {
	 * 
	 * } public Trees(int size){ root = null; maxSize = size; this.children = new
	 * ArrayList<>(); } public void add(int data) { this.children.add(new
	 * Trees(data));
	 * 
	 * } public void remove(int data) {
	 * 
	 * } public static void main(String[] args) { Trees treeObj = new Trees(10);
	 * 
	 * } public void display() { NodeTree currentNode = new NodeTree();
	 * currentNode.display(root.data); }
	 */
}

