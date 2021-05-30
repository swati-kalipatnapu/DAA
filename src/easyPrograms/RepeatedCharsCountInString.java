package easyPrograms;
import java.util.Stack;
public class RepeatedCharsCountInString {

	public static void main(String[] args) {
		String str = "aabbbcc";
		Stack stk = new Stack();
		int i=0;
		while(i<str.length()-1) {
			stk.push(str.charAt(i));
			
			i++;
		}
		System.out.println(stk.peek());
	}

}
