package DifficultPrograms;

public class StackImplementation {
	int top ;
	int maxSize;
	int count;
	int[] stack;
	public StackImplementation(int size) {
		top= -1;
		maxSize = size;
		count = 0;
		stack = new int[maxSize];
	}
		
		
		public void push(int value) {
			if(top == maxSize -1) {
				System.out.println("Stack is full");
			
			}
			top++;
			stack[top] = value;
		
		}
		public void pop() {
			if(top == -1) {
				System.out.println("Stack underflow");
			}
			top--;
			
		}
		public int peek() {
			int value = stack[top];
			return value;
		}
		public void show() {
			for(int i=top;i>=0;i--) {
				System.out.println("Stack : "+stack[i]);
			}
		}
	public static void main(String[] args) {
		StackImplementation st = new StackImplementation(5);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(20);
		st.push(50);
		st.pop();
		//st.push(60);
		System.out.println(st.peek());
		st.show();

	}

}
