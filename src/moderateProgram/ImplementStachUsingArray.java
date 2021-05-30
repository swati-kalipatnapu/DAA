package moderateProgram;
import java.util.Arrays;
public class ImplementStachUsingArray {

	int stackArray[] = new int[5];
	int top = -1;
	
	private boolean push(int n) {
		try{
		top++;
		stackArray[top] = n;
		System.out.println("element pushed:" + n);
		return true;
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("Can't insert a value as array is filled");
	}
		return false;}
	private int pop() {
		try {
		
		int i = stackArray[top];
		stackArray[top] = 0;
		top--;
		return i;
		}
		catch(ArrayIndexOutOfBoundsException n) {
			System.out.println("No elements to be removed");
		}
		return top;
	}
	private int peek() {
		return stackArray[top];
	}
	
	
	private void display() {
		for(int i : stackArray) {
			System.out.print(i+" ");
		}
		
		
	}
	public static void main(String[] args) {
		ImplementStachUsingArray i = new ImplementStachUsingArray();
		i.push(10);
		i.push(20);
		i.push(30);
		i.display();
		i.push(40);
		i.push(50);
		i.display();System.out.println();
		System.out.println(i.pop());
		System.out.println(i.pop());
		System.out.println(i.peek());
		i.push(60);
		i.push(50);
		i.push(70);
		//System.out.println(i.peek());
		i.display();
		}

}
