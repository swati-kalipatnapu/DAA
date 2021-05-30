package DifficultPrograms;
import java.util.*;

	
	
class Queue{
	int front,rear;
	int[] queue ;
	int maxSize;	
	public Queue(int size){
		front = 0;
		rear = -1;
		queue = new int[size];
		maxSize = size;
	}
	public void enqueue(int value) {
		if(rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		queue[rear] = value;
		//System.out.println(value+"added");
	}
	public void deQueue() {
		int temp = queue[front];
		/* front = (front+1)%5; */
		front++;
		//System.out.println(temp+"removed");
	}
	public int peek() {
		if(rear == -1) {
			return -1;
		}
		return queue[front];
	}
	public void show() {
		/*
		 * for(int i=0;i<maxSize;i++) { System.out.print(queue[(front+i)%maxSize]); }
		 */
		System.out.print("[");
		for(int i=0;i<maxSize;i++) {
			System.out.print(queue[(front +i)%maxSize]+" ");
		}
		System.out.println("]");
		/*
		 * for(int i : queue) { System.out.print(i+" "); }
		 */
	}
	
	
}
public class QueueImplementation {
	public static void main(String[] args) {
		Queue qi = new Queue(10);
		qi.enqueue(1);
		qi.enqueue(2);
		qi.enqueue(3);
		qi.enqueue(4);
		qi.enqueue(5);
		
		qi.enqueue(6);
		qi.enqueue(7);
		qi.enqueue(8);
		qi.enqueue(9);
		qi.enqueue(10);
		
		//qi.show();
		//qi.enqueue(99);
		//qi.show();
		/*
		 * qi.deQueue(); qi.deQueue(); qii.deQueue(); qii.deQueue();
		 */
		
		//System.out.println(qi.peek());
		qi.show();
		for (int i = 0; i <qi.maxSize; i++)  
	    { 
	        System.out.print(qi.peek() + " "); 
	        qi.peek(); 
	    } 
	}
		public static void interLeave(Queue qi) {
		Stack<Integer> s = new Stack<>();
		int halfSize = qi.maxSize/2;
		for(int i=0;i<halfSize;i++) {
			s.push(qi.peek());
			qi.peek();
		}
		while (!s.empty())  
	    { 
	        qi.enqueue(s.peek()); 
	        s.pop(); 
	    } 
		for (int i = 0; i < halfSize; i++) 
	    { 
	        s.push(qi.peek()); 
	        qi.peek(); 
	    } 
		while (!s.empty()) 
	    { 
	        qi.enqueue(s.peek()); 
	        s.pop(); 
	        qi.enqueue(qi.peek()); 
	        qi.peek(); 
	    } 
	}
	
}
