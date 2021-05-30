package day2Assignment;

import java.util.*;
public class Prg5QueueReversalUsingRecursion {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		  q.add(10); 
		  q.add(20); 
		  q.add(30);
		  q.add(40); 
		  q.add(50); 
		  q.add(60);
		  q.add(70);
		  q.add(80);
		  q.add(90); 
		  q.add(100);
		 QueueReversal(q);
		 System.out.println(q);
	}

	private static Queue<Integer> QueueReversal(Queue<Integer> q) {
		if(q.isEmpty()) {
			return q;
		}
		else {
			int value = q.poll();
			
			q = QueueReversal(q);
			q.add(value);
		}
		return q;
	}
}