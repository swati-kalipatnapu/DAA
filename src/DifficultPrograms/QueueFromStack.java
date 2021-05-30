package DifficultPrograms;

import java.util.Stack;

import DifficultPrograms.StackImplementation;
public class QueueFromStack {
	Stack<Integer> firstStack ;
	Stack<Integer> secondStack;
	
	public QueueFromStack(int size) {
		this.firstStack = new Stack<Integer>();
		this.secondStack = new Stack<Integer>();
	}
	

	public static void main(String[] args) {
		QueueFromStack q1 = new QueueFromStack(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.dequeue();
		System.out.println(q1.peek());

	}


	private void enqueue(int i) {
		this.firstStack.push(i);
		System.out.println(i+"element pushed");
		
	}
	private int dequeue() {
		while(!this.firstStack.empty()) {
			this.secondStack.push(this.firstStack.pop());
		}
		int value = this.secondStack.pop();
		while(!this.secondStack.isEmpty()) {
			this.firstStack.push(this.secondStack.pop());
		}
		return value;
	}
	private int peek() {
		while(!this.firstStack.isEmpty()) {
			this.secondStack.push(firstStack.pop());
		}
		int value = this.secondStack.peek();
		while(!this.secondStack.isEmpty()) {
			this.firstStack.push(secondStack.pop());
		}
		return value;
		
	}

}
