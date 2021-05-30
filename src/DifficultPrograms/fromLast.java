package DifficultPrograms;

public class fromLast {

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
		  System.out.println(fromLastMethod(ll,0).data);
	}

	private static Node fromLastMethod(LinkedListImplementation ll,int n) {
		Node slow = ll.getFirst();
		Node fast = ll.getFirst();
		
		while(n>0) {
			fast = fast.next;
			n--;
		}
		while(fast.next != null ) {
			slow = slow.next;
			fast = fast.next;
			
		}
		return slow;
		
		
	}
	

}
