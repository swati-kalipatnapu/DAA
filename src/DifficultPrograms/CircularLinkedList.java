package DifficultPrograms;
import DifficultPrograms.LinkedListImplementation;
public class CircularLinkedList {

	public static void main(String[] args) {
		 LinkedListImplementation ll = new LinkedListImplementation();
		  
		   ll.insertAt(0, 1);
		   ll.insertAt(1, 2);
		  ll.insertAt(0, 5);
		  ll.insertAt(2, 67); 
		  ll.insertAt(3, 87);
		  ll.insertAt(ll.size, 9);
		  
		  System.out.println(ll.size); 
		 ll.insertAt(ll.size, 6);
		
		  System.out.println(ll.size);
		  ll.displayList();
		  			 
		  System.out.println(isCircularLinkedList(ll));

	}
	public static boolean isCircularLinkedList(LinkedListImplementation ll) {
		Node slow = ll.getFirst();
		Node fast = ll.getFirst();
		
		while(fast.next!= null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
		
	}

}
