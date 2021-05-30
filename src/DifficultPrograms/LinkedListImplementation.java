package DifficultPrograms;

import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListImplementation {
	int data;
	int size;
	Node first;
	Node last;

	public LinkedListImplementation() {
		this.data = data;
		this.first = null;
		this.last = null;
		size = 0;
	}
	

	/*
	 * public static void main(String[] args) { LinkedListImplementation ll = new
	 * LinkedListImplementation(); ll.insertAt(0, 1); ll.insertAt(1, 2);
	 * ll.insertAt(0, 5); ll.insertAt(2, 67); ll.insertAt(size, 9);
	 * System.out.println(size); ll.insertAt(size, 6); System.out.println(size);
	 * ll.displayList();
	 * 
	 * 
	 * ll.displayList(); System.out.println(); System.out.println(ll.size);
	 * System.out.println(ll.getFirst()); System.out.println(ll.getLast());
	 * ll.inserLast(50); ll.removeFirst(); ll.insertFirst(60); ll.inserLast(30);
	 * ll.displayList(); System.out.println();
	 * System.out.println(ll.getLast().data); //ll.clear(); //ll.removeFirst();
	 * ll.displayList(); System.out.println(ll.size);
	 * 
	 * 
	 * 
	 * ll.removeLast(); ll.displayList(); System.out.println(ll.getLast());
	 * System.out.println(ll.getAt(2).data); ll.removeAt(0); //ll.clear();
	 * ll.removeAt(2); ll.displayList(); ll.insertAt(2, 40); ll.displayList();
	 * ll.insertFirst(70); ll.inserLast(100); ll.displayList(); ll.insertAt(0, 500);
	 * ll.displayList(); //ll.removeLast(); ll.removeAt(5); ll.displayList();
	 * System.out.println(ll.getLast().data); ll.displayList();
	 * System.out.println(ll.size); System.out.println(ll.getFirst().data);
	 * System.out.println(ll.getLast().data);
	 * 
	 * }
	 */
	/* when list is empty */
	public boolean isEmpty() {
		return first == null;
	}

	/*
	 * public Node insertFirst(int data) { Node newNode = new Node(); newNode.data =
	 * data; when list is empty if(isEmpty()) { last = newNode; }
	 * 
	 * size++; newNode.next = first; first = newNode; return first; }
	 */
	/*
	 * public Node inserLast(int data) { Node newNode = new Node(); newNode.data =
	 * data; when list is empty if (first == null) { first = newNode;
	 * 
	 * } newNode.next = last.next; last.next = newNode; last = newNode; size++;
	 * return newNode; }
	 */

	public Node getFirst() {
		// return first;
		return getAt(0);
	}

	public Node getLast() {
		// return last;
		return getAt(size - 1);

	}

	public void removeFirst() {
		if (isEmpty()) {
			System.out.println("No List");
		}
		Node currentNode = first;

		currentNode.next = first.next;
		currentNode = first.next;

		first = currentNode;
		size--;
	}

	public Node removeLast() {
		if (isEmpty()) {
			System.out.println("No list");
		}
		/* when list has one node */
		if (size == 1) {
			first = null;
		}

		Node previous = first;
		Node currentNode = first.next;
		while (currentNode.next != null) {
			previous = currentNode;
			currentNode = currentNode.next;
		}
		last = previous;
		previous.next = null;
		// previous = null;

		size--;
		/*
		 * currentNode.next = last.next; currentNode.previous = last.previous;
		 * currentNode = last.next; last = currentNode;
		 */
		return last;
	}

	public void clear() {
		first = null;
	}

	public Node getAt(int key) {
		if (isEmpty()) {
			return null;
		}
		Node currentNode = first;
		int count = 0;
		while (count != key) {
			currentNode = currentNode.next;
			count++;
		}

		return currentNode;
	}

	public void removeAt(int key) {
		if (isEmpty()) {
			return;
		}
		Node previous = first;
		Node currentNode = first.next;
		Node nodeToDelete = getAt(key);
		if (nodeToDelete == first) {
			first = first.next;
		} else {

			while (currentNode != nodeToDelete) {
				previous = currentNode;
				currentNode = currentNode.next;
			}
			if (currentNode == last) {
				last = previous;
				removeLast();

			} else {
				previous.next = currentNode.next;
			}
		}
		size--;
	}

	public void insertAt(int key, int data) {
		Node newNode = new Node();
		Node previous = last;
		newNode.data = data;
		if (isEmpty()) {
			first = newNode;

		}

		else {
			Node currentNode = getAt(key);

			if (currentNode == first) {
				newNode.next = first;
				first = newNode;

			}

			else {

				Node previousNode = getAt(key - 1);

				currentNode = previousNode;

				if (currentNode == null) {
					newNode.next = last.next;
					last.next = newNode;
					last = newNode;

					previous.next = last;
					last = previous.next;

				} else {
					newNode.next = currentNode.next;
					currentNode.next = newNode;
				}
			}

		}
		size++;
	}

	public void displayList() {
		Node currentNode = first;
		while (currentNode != null) {
			currentNode.display();
			currentNode = currentNode.next;
		}
		System.out.println("reached end of linkedList");
	}
}

class Node {
	Node next;
	Node previous;
	int data;
	Node node;

	public Node() {
		this.next = next;
		this.data = data;
	}

	public void display() {
		System.out.print(data + "-->");
	}

	/*
	 * public boolean isEmpty() { // TODO Auto-generated method stub return false; }
	 */

}
