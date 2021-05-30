package day2Assignment;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;
public class Prg4QueueReversal {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Queue<Integer> q =new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int k ;
		int numOfElements;
		System.out.println("Enter number of elements in queue: ");
		numOfElements = sc.nextInt();
		System.out.println("Enter the elements in the queue: ");
		for(int i=0;i<numOfElements;i++) {
			q.add(sc.nextInt());
		}
		System.out.println("Enter the point till queue to be reversed:");
		k = sc.nextInt();
		Stack s = new Stack();
		System.out.println("Original queue is: "+q);
		
		  for(int i=0;i<k;i++) {
			  s.push(q.remove());
		  }
		  for(int i=0;i<k;i++) {
			  q.add((Integer)s.pop()); 
		  } 
		  for(int i=0;i<q.size()-k;i++) {
			  q.add(q.remove());
		  }
		  System.out.println("After reversal till"+k+"th point queue is: "+q);
		 
		
		
	}

}
