package day2Assignment;
import java.util.Stack;
public class prg1InfixToPostfix {

	public static void main(String[] args) {
		String str = "A*(B+C)/D";
		String newStr = infixToPostfix(str);
		System.out.println(newStr);
	}

	private static String infixToPostfix(String str) {
		Stack<Character> stk = new Stack<>();
		String newStr ="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(precedence(ch) >0) {
				while((stk.isEmpty() == false && precedence(ch)<=precedence(stk.peek()))) {
					newStr += stk.pop();
				}
				stk.push(ch);
			
			}else if(ch == '(') {
				stk.push(ch);
			}else if(ch == ')') {
				char topOfStack = stk.pop();
				while(topOfStack != '(') {
					newStr += topOfStack;
					topOfStack = stk.pop();
				}
			}
			else {
				newStr += ch;
			}
		}
		for(int i=0;i<stk.size();i++) {
			newStr += stk.pop();
		}
				
		return newStr;
	}
	static int precedence(char c) {
		switch(c){
		case '+':
		case '-':	return 1;
		case '*':
		case '/':	return 2;
		case '^':	return 3;
		}
		return -1;
		
	}
}
